package Practice8;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

public class SpecBuilder {
	
	public static void main(String[] args) {
		
		PostResponseS r = new PostResponseS();
		
		r.setAccuracy(50);
		r.setAddress("dfdkfjdk");
		r.setLanguage("english");
		r.setName("frontline house");
		r.setPhone_number("3454533");
		r.setWebsite("34kjdklfjd");
		
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");

		r.setTypes(myList);

		Location l =new Location();
		l.setLat(34343);
		l.setLng(343434);
		
		r.setLocation(l);
		
		
	RequestSpecBuilder reqSpecBui = new RequestSpecBuilder();	
	ResponseSpecBuilder resSpecBui = new ResponseSpecBuilder();
	
	
	RequestSpecification req = reqSpecBui.setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").
			setContentType(ContentType.JSON).build();
	
	ResponseSpecification res = resSpecBui.expectStatusCode(200).expectContentType(ContentType.JSON).build();
	
	Response response =  RestAssured.given().spec(req).body(r).when().
			post("/maps/api/place/add/json").then().assertThat().spec(res).extract().response();
			
	String sc = response.asString();
	System.out.println(sc);

	}
}