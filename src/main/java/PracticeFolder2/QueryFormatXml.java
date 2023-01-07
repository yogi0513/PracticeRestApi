package PracticeFolder2;

import java.util.Properties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class QueryFormatXml {

	Properties p = new Properties();
	Resoursces r = new Resoursces();
	
	@BeforeTest
	public void befo() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\yogen\\eclipse-workspace\\RestAssureR\\src\\PracticeFolder2\\env.property");
		p.load(fis);

	}
	
	
	@Test
	public void addDeletePlace() {
		
		RestAssured.baseURI	 = p.getProperty("HOST");
Response res =		given().queryParam("key", p.getProperty("KEY")).log().all().body(PayLoad.bodyXml()).
		when().post(r.post("xml")).andReturn()
		.then().assertThat().statusCode(200).and().contentType(ContentType.XML).extract().response();
		
        String sc =ReusableM.rawToXml(res).get("response.place_id");
        System.out.println(sc);
        
		
	}
}
