package Reqres.Practice11;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class PostReq {
		public static void main(String[] args) {
			//create post request
			
			RestAssured.baseURI="https://reqres.in/";
			Response res = given().log().all().body("{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"leader\"\r\n"
					+ "}").when().get("/api/users").then().assertThat().statusCode(200).
			contentType(ContentType.JSON).extract().response();
			
		String resp =	res.asString();
		System.out.println(resp);
		JsonPath js = new JsonPath(resp);
		
		
		int resq = js.get("page");
		System.out.println(resq);
		assertEquals(resq, 1);
		
		String s =js.get("data[2].email");
		System.out.println(s);
		assertEquals(s, "emma.wong@reqres.in");
	
		
		String s1 = js.get("data[3].avatar");
		System.out.println(s1);
		assertEquals(s1, "https://reqres.in/img/faces/4-image.jpg");
		
		
	}
}
