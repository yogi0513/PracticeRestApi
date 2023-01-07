package PracticeFolder2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class QJsonSTaticUsingFilePath {
	Properties p = new Properties();
	
	
	@BeforeTest
	public void data() throws IOException {
FileInputStream fis = new FileInputStream("C:\\Users\\yogen\\eclipse-workspace\\RestAssureR\\src\\PracticeFolder2\\env.property");
		p.load(fis);

	}
	
	
	
	@Test
	public void addDeletePlace() throws IOException {
		String postData = GenerateStringFromResource("D:\\Study Material\\selenium\\postData.json");
		RestAssured.baseURI = p.getProperty("HOST");
		Response res = given().queryParam("key", p.getProperty("KEY")).
		body(PayLoad.body())
		.when().post(p.getProperty("POST")).andReturn().
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
		.body("status",equalTo("OK")).and()
		.extract().response();
	
		String sc = ReusableM.rawToJson(res).get("place_id");
		
		given().queryParam("key", p.getProperty("KEY")).body("{" +
				"\"place_id\": \"" + sc + "\"" +
				"}"	)
			.when().post(p.getProperty("DELETE")).andReturn()
			.then().log().all().
			assertThat().statusCode(200).and().contentType(ContentType.JSON).body("status", equalTo("OK"));
			
		
	}
	
public static String GenerateStringFromResource(String path) throws IOException{
		
		return new String(Files.readAllBytes(Paths.get(path)));
		
		// this method takes JSON character by character read bytes and convert to string format and return string ---
	}
}
