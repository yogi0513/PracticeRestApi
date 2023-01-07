package Practice6;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class getRequest {

	@Test
	public void getWeatherDetails() {
	String res =given().
		when().get("https://demoqa.com/BookStore/v1/Books").andReturn()
		.then().statusCode(200).statusLine("HTTP/1.1 200 OK").assertThat().body("books[0].isbn", equalTo("9781449325862"))
		.extract().response().asString();
	
	
	JsonPath js = new JsonPath(res);
		int no = js.getInt("books.size()");
		System.out.println(no);
		
		ArrayList al = new ArrayList(10);
		
		for(int i=0 ; i<no;i++) {
			al.add(js.get("books["+i+"].isbn"));
		}
		System.out.println(al);
	}
}
