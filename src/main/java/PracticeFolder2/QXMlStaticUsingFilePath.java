package PracticeFolder2;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class QXMlStaticUsingFilePath {

	Properties p = new Properties();
	Resoursces rs = new Resoursces();
	
	@BeforeTest
	public void befo() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\yogen\\eclipse-workspace\\RestAssureR\\src\\PracticeFolder2\\env.property");
		p.load(fis);

	}
	
	
	@Test
	public void tese1() throws IOException {
		
		String postData = GenerateStringFromResource("D:\\Study Material\\selenium\\postData.xml");
		RestAssured.baseURI = p.getProperty("HOST");

	Response res = 
			given().
			queryParam("key",p.getProperty("KEY")).
			body(postData).
			when().
			post(rs.post("xml")).
			then().
			assertThat().statusCode(200).contentType(ContentType.XML).
			extract().response();
	
//	XmlPath p = ReusableMethod.rawToXml(res);
	
	String placeid = ReusableM.rawToXml(res).get("response.place_id");
	System.out.println(placeid);
	
	Response r =
			given().queryParam("key", p.getProperty("KEY")).body("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n"
			+ "<root>\r\n"
			+ "    <place_id>"+ placeid +"</place_id>\r\n"
			+ "</root>").
			when().post(rs.delete("xml")).andReturn()
	.then().assertThat().statusCode(200).and().contentType(ContentType.XML).extract().response();
	
	
}


	
public static String GenerateStringFromResource(String path) throws IOException{
		
		return new String(Files.readAllBytes(Paths.get(path)));
		
		// this method takes xml character by character read bytes and convert to string format and return string ---
	}
	
	
	
	
	
}

