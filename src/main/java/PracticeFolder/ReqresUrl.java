package PracticeFolder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ReqresUrl {
	
	public static void main(String[] args) {
		/*
		RestAssured.baseURI="https://reqres.in/";
		given().queryParam("page", "2").log().all().
		when().get("/api/users").
		andReturn().
		then().log().all().
		assertThat().statusCode(200).contentType(ContentType.JSON).body("data[0].first_name", equalTo("Michael"));
		*/
	//--------------------------------------------------------------------------------
		/*
		RestAssured.baseURI="https://reqres.in";
		
		given().log().all().when().get("/api/users/2").andReturn()
		.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		body("support.url", equalTo("https://reqres.in/#support-headin")).
		body("data.avatar", equalTo("https://reqres.in/img/faces/2-image.jpg"));
		*/
	//---------------------------------------------------------------------------
	/*	
		RestAssured.baseURI="https://reqres.in";
		
		given().log().all().when().get("/api/users/23").andReturn().then()
		.and().assertThat().statusCode(200).and().contentType(ContentType.JSON);
	*/	
		
	//--------------------------------------------------------------------------------------
		//post method
		
		
	}
}
