package PracticeFolder2;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PracticeFolder2.ReusableM;
import static io.restassured.RestAssured.given;


public class QueryFormat {

	Properties p = new Properties();
	
	
	@BeforeTest
	public void data() throws IOException {
FileInputStream fis = new FileInputStream("C:\\Users\\yogen\\eclipse-workspace\\RestAssureR\\src\\PracticeFolder2\\env.property");
		p.load(fis);

	}
	
	
	
	@Test
	public void addDeletePlace() {
		
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
	
	
}
