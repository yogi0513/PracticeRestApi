package Practice8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;




public class PostMusingSerial {

	public static void main(String[] args) {
		
	PostResponseS r = new PostResponseS();
	r.setAccuracy(50);
	r.setAddress("29, side layout, cohen 09");
	r.setLanguage("French-IN");
	r.setName("Frontline house");
	r.setWebsite("http://google.com"); 
	r.setPhone_number("(+91) 983 893 3937");
	
	List<String> myList = new ArrayList<String>();
	myList.add("shoe park");
	myList.add("shop");

	r.setTypes(myList);

	Location l = new Location();
	
	l.setLat(-38.383494);
	l.setLng(33.427362);
		
	r.setLocation(l);
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		Response res =
				
				given().log().all().queryParam("key", "qaclick123").
				body(r).		
				when().post("/maps/api/place/add/json").
		
				then().assertThat().statusCode(200).and().extract().response();
		 
		String response = res.asString();
		
		System.out.println(response);
		
		
		
	}
}
/*
 * Base URL -https://rahulshettyacademy.com
 * 
 */

