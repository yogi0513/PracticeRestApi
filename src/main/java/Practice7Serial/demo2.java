package Practice7Serial;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class demo2 {
	/*
	@Test
	public void test1() {
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		Response rs =given().queryParam("key", "qaclick123").body("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n"
				+ "<root>\r\n"
				+ "    <location>\r\n"
				+ "        <lat>-38.383494</lat>\r\n"
				+ "        <lng>33.427362</lng>\r\n"
				+ "    </location>\r\n"
				+ "    <accuracy>50</accuracy>\r\n"
				+ "    <name>The Mens store</name>\r\n"
				+ "    <phone_number>(+91) 983 893 3937</phone_number>\r\n"
				+ "    <address>Anna Salai, Chennai</address>\r\n"
				+ "    <types>shoe park</types>\r\n"
				+ "    <types>kadai</types>\r\n"
				+ "    <website>http://google.com</website>\r\n"
				+ "    <language>tamil-IN</language>\r\n"
				+ "</root>").when().post("/maps/api/place/add/xml").andReturn().then().assertThat().statusCode(200).and()
		.contentType(ContentType.XML).extract().response();
			
			
		
		String sc = rs.asString();
		System.out.println(sc);
	}
	*/
		@Test
		public void test2() {
			RestAssured.baseURI= "https://rahulshettyacademy.com";
			Response rs1 =given().
			queryParam("place_id", "75c2415ecf1e4738540d85323720970b").queryParam("key", "qaclick123").
	when().get("/maps/api/place/get/xml").andReturn().then().assertThat().statusCode(200).and()
	.contentType(ContentType.XML).extract().response();
			
				
			String sc1 = rs1.asString();
			System.out.println(sc1);
		}
		
		
		@Test
		public void test3() {
			RestAssured.baseURI= "https://rahulshettyacademy.com";
			Response rs12 =given().queryParam("key", "qaclick123").
					body("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n"
							+ "<root>\r\n"
							+ "    <place_id>75c2415ecf1e4738540d85323720970b</place_id>\r\n"
							+ "</root>").
	when().post("/maps/api/place/delete/xml").andReturn().then().assertThat().statusCode(200).and()
	.contentType(ContentType.XML).extract().response();
			
				
			String sc11 = rs12.asString();
			System.out.println(sc11);
		}
	
}
