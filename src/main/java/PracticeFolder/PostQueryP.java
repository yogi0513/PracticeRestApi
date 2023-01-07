package PracticeFolder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class PostQueryP {
	
	
	String str= "    {   \r\n"
			+ "    \"location\":{  \r\n"
			+ "       \"lat\" : -38.383494, \r\n "
			+ "       \"lng\" : 33.427362   \r\n "
			+ "    },    \r\n"
			+ "    \"accuracy\":50,  \r\n "
			+"    \"name\":\"Yogendra burkul\", \r\n "
			+"    \"phone_number\":\"(+91) 983 893 3937\",  \r\n "
			+"    \"address\" : \"29, side layout, cohen 09\", \r\n "
			+"    \"types\": [\"shoe park\",\"shop\"],   \r\n "
			+"    \"website\" : \"http://google.com\", \r\n  "
			+"    \"language\" : \"French-IN\"  \r\n "
			+"     } ";
/*
	@Test
	public void postData() {
		
		RestAssured.baseURI = "http://rahulshettyacademy.com";
		
		given().queryParam("key", "qaclick123")
		.body(str).
		when().post("maps/api/place/add/json").
		andReturn().
		then().assertThat().statusCode(200).contentType(ContentType.JSON).and().body("status", equalTo("OK"));
	}
	
	*/
	
/*			@Test
	public void postDataDeleteData() {
		
		RestAssured.baseURI="http://rahulshettyacademy.com";
	
		Response res = given().queryParam("key", "qaclick123").log().all().body(str)
		.when().post("maps/api/place/add/json").andReturn()
		.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();

		JsonPath js = ReusableMethod.rawToJson(res);
		
	String place_id = js.get("place_id");
	System.out.println(place_id);    
		
	given().queryParam("key", "qaclick123").body("{" +
			"\"place_id\": \"" + place_id + "\"" +
			"}"	)
		.when().post("maps/api/place/delete/json").andReturn()
		.then().log().all().
		assertThat().statusCode(200).and().contentType(ContentType.JSON).body("status", equalTo("OK"));
		
	}
	
*/

	/*
	 * 	RestAssured.baseURI ="http://rahulshettyacademy.com";
		
	Response res = 	given().queryParam("key", "qaclick123").log().all().body(str).
					when().post("maps/api/place/add/json")
					.andReturn()
					.then().assertThat().log().all().extract().response();
		
		JsonPath js = ReusableMethod.rawToJson(res);
		
		String st = js.get("place_id");
		
		System.out.println(st);
		
	Response ress =given().queryParam("key", "qaclick123").body("{\"place_id\":\""+st+"\"}").
		when().delete("maps/api/place/delete/json")
		.andReturn().
		then().and().statusCode(200).contentType(ContentType.JSON).body("status", equalTo("OK")).extract()
		.response();
	
	String sc = ress.asString();
	System.out.println(sc);
	
	}

	 */
	
	
	
}
