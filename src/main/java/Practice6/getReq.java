package Practice6;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getReq {
	
	@Test
	public void test1() {
		RestAssured.baseURI = "https://demoqa.com";
		given().log().all().when().get("/BookStore/v1/Books").andReturn().then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
		.body("books[2].description", equalTo("yogendra")).body("books[1].pages", equalTo("238"));
		
	}
}
