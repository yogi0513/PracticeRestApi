package PracticeFolder2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PracticeFolder2.ReusableM;
import static io.restassured.RestAssured.given;

public class QueryFormat1 {

	Properties p = new Properties();
	Resoursces r = new Resoursces();
	
	
	@BeforeTest
	public void beforeData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\yogen\\eclipse-workspace\\RestAssureR\\src\\PracticeFolder2\\env.prop");
		p.load(fis);
	}
	
	
	
	@Test
public void postDataDeleteData() {

RestAssured.baseURI= p.getProperty("HOST");

Response res = given().queryParam("key", p.getProperty("KEY")).log().all().body(PayLoad.body())
.when().post(r.post("json")).andReturn()
.then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();

JsonPath js = ReusableM.rawToJson(res);

String place_id = js.get("place_id");
System.out.println(place_id);    

given().queryParam("key", p.getProperty("KEY")).body("{" +
	"\"place_id\": \"" + place_id + "\"" +
	"}"	)
.when().post(r.delete("xml")).andReturn()
.then().log().all().
assertThat().statusCode(200).and().contentType(ContentType.JSON).body("status", equalTo("OK"));

}

}
