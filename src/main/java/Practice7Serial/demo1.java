package Practice7Serial;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class demo1 {
/*		
	@Test
	public void test1() {
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		Response rs =given().queryParam("key", "qaclick").body("{\r\n"
				+ "    \"location\":{\r\n"
				+ "        \"lat\" : -38.383494,\r\n"
				+ "        \"lng\" : 33.427362\r\n"
				+ "    },\r\n"
				+ "    \"accuracy\":50,\r\n"
				+ "    \"name\":\"Frontline house\",\r\n"
				+ "    \"phone_number\":\"(+91) 983 893 3937\",\r\n"
				+ "    \"address\" : \"29, side layout, cohen 09\",\r\n"
				+ "    \"types\": [\"shoe park\",\"shop\"],\r\n"
				+ "    \"website\" : \"http://google.com\",\r\n"
				+ "    \"language\" : \"French-IN\"\r\n"
				+ "}").when().post("/maps/api/place/add/json").andReturn().then().assertThat().statusCode(200).and()
		.contentType(ContentType.JSON).body("status", equalTo("OK")).extract().response();
			
			
		
		String sc = rs.asString();
		System.out.println(sc);
	}
	*/	
		@Test
		public void test2() {
			RestAssured.baseURI= "https://rahulshettyacademy.com";
			Response rs1 =given().
			queryParam("place_id", "e4dbb93f864013f5f8c8b65b26cfc488").queryParam("key", "qaclick123").
	when().get("/maps/api/place/get/json").andReturn().then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).extract().response();
			
			
			String sc1 = rs1.asString();
			System.out.println(sc1);
		}
		
		
		@Test
		public void test3() {
			RestAssured.baseURI= "https://rahulshettyacademy.com";
			Response rs12 =given().queryParam("key", "qaclick123").
					body("{ \"place_id\": \"e4dbb93f864013f5f8c8b65b26cfc488\"\r\n"
							+ " }").
	when().post("/maps/api/place/delete/json").andReturn().then().assertThat().statusCode(200).and()
	.contentType(ContentType.JSON).extract().response();
			
				
			String sc11 = rs12.asString();
			System.out.println(sc11);
		}
	
}
