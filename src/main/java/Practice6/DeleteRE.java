package Practice6;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class DeleteRE {

	@Test
	public void testPost() {
		RestAssured.baseURI="https://demoqa.com/Account";
		
	String sc =	given().
			contentType("application/json").
		when().delete("/v1/User/yogendra0513").
		andReturn().then().assertThat().statusCode(201).extract().response().asString();
		
	System.out.println(sc);
	

}
}