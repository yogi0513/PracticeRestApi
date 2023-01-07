package PracticeFolder;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class practice19 {
	
	public static void main(String[] args) {
/*		
		RestAssured.baseURI= "http://rahulshettyacademy.com";
		
		given().queryParam("place_id","f7bb93058204d44f76d62172ae523b7b").
		queryParam("key","qaclick123").
		
		when().get("/maps/api/place/get/json")
		.then().assertThat().
		statusCode(200).and().contentType(ContentType.JSON).and().
		body("name",equalTo("Frontline house"));
		*/
	/*	
		RestAssured.baseURI = "http://rahulshettyacademy.com";
		
		given().queryParam("place_id", "9a58822444aa6bdc35a636451ad47810").queryParam("key", "qaclick123").

		when().get("/maps/api/place/get/json").andReturn().
		then()    //.log().all().
		.statusCode(200).contentType(ContentType.JSON)
		.body("address", equalTo("29, side layout, cohen 09")).body("name", equalTo("Yogendra burkul")).and()
		.header("Content-Type", equalTo("application/json;charset=UTF-8"));
		
	*/
		
	/*	
		RestAssured.baseURI ="";
		
	Response res	=	given().param("location","-33.8670522,151.1957362")
		.param("radius","500")
		.param("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y")
		.when().get("/maps/api/place/nearbysearch/json")
		.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and()
		. body("results[0].name",equalTo("Sydney")).and().
	       body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
	       header("Server","pablo").extract().response();
		
		// converting response into json --- using reusable method 
		JsonPath js = ReusableMethod.rawToJson(res);
		
		int count = js.getInt("results.size()");
		int couna = js.getInt("results.size()");   // this will give size of array of json
		
		for(int i=0;i<couna;i++) {
			System.out.printf(js.get("results["+i+"].name"));
			System.out.println();
		}
		
	*/	
	/*	
		RestAssured.baseURI="https://reqres.in/api";
		
	Response re = given().queryParam("page", "2")
		.when().get("/users").andReturn()
		.then().assertThat()
		.and().statusCode(200).and().contentType(ContentType.JSON).extract().response();
		
		String resP = re.asString();
	//	System.out.println(resP);
	       
		JsonPath js = new JsonPath(resP);
		
		int count = js.getInt("data.size()");
		
		for(int i=0;i<count;i++) {
			System.out.printf(js.get("data["+i+"].first_name"));
			System.out.println();
		}
	 */
	
		
		
		
	}
}
