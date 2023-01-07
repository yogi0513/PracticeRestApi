package Practice6;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class Post_Request {

	public static HashMap map= new HashMap();
	
	String [][] data= { {"isbn", "string"},
			{"title", "string"},
	{ "subTitle", "string"},
	{	      "author", "string"},
	{	      "publish_date", "2022-07-22T03:22:02.005Z"},
		      {"publisher", "string"},
		      {"pages", "0"},
		      { "description", "string"},
		      {"website","string"}
		    	  };
	
	
	@BeforeTest
	public void testData() {
		
		 map.put("userName", "yogendra05");
		 map.put("password", "E150400yogi@");
		 map.put("books", data);
		 RestAssured.baseURI="https://demoqa.com/Account";
		 RestAssured.basePath= "/v1/User";
	
	}
	
	@Test
	public void testPost() {
		
	String sc =	given().contentType("application/json").body(map).
		when().post().
		andReturn().then().assertThat().statusCode(201).extract().response().asString();
		
	System.out.println(sc);
	
		
		
		String s1c =	given().contentType("application/json").
			when().get("/v1/User/yogendra0513").
			andReturn().then().assertThat().statusCode(200).extract().response().asString();
			
		System.out.println(s1c);
		
	}
}

/*
base url- https://demoqa.com/Account/v1/User

body = 
{
"userName": "string",
"password": "string"
}

Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), 
one uppercase ('A'-'Z'), one lowercase ('a'-'z'), 
one special character and Password must be eight characters or longer."

will use the concept of hashmap which has key and value 
*/

// as given random password so get -- 400 error bad request --
// give correct password 


