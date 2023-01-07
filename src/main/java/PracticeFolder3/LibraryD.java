package PracticeFolder3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import PracticeFolder2.ReusableM;
import PracticeFolder2.ReusableM;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class LibraryD {

	Properties p = new Properties();

	@BeforeTest
	public void befo() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\yogen\\eclipse-workspace\\RestAssureR\\src\\PracticeFolder2\\env.property");
		p.load(fis);

	}

	@Test
	public void test1() {
		RestAssured.baseURI = p.getProperty("HOST1");

		Response res = given().header("Content-Type", "application/json").body(PayLoad2.addBook1("sushil41", "41112")).

				when().post(p.getProperty("POST2")).then().assertThat().statusCode(200).contentType(ContentType.JSON)
				.extract().response();

		String s = res.asString();
		System.out.println(s);

		JsonPath js = ReusableM.rawToJson(res);

		String sc = js.get("ID");
		System.out.println(sc);

		Response re = given().body("{ \"ID\": \"" + sc + "\" } ").when().post(p.getProperty("DELETE2")).andReturn()
				.then().statusCode(200).and().contentType(ContentType.JSON).extract().response();

		JsonPath jsv = ReusableM.rawToJson(re);
		String da = jsv.get("msg");
		System.out.println(da);

	}

}
