package PracticeFolder3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PracticeFolder2.ReusableM;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LibDynamicParam {

	Properties p = new Properties();

	@BeforeTest
	public void befo() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\yogen\\eclipse-workspace\\RestAssureR\\src\\PracticeFolder2\\env.property");
		p.load(fis);

	}

	@Test(dataProvider = "bookData")
	public void test1(String a, String b) {
		RestAssured.baseURI = p.getProperty("HOST1");

		Response res = given().header("Content-Type", "application/json").body(PayLoad2.addBook1(a, b)).when()
				.post(p.getProperty("POST2")).andReturn().then().assertThat().body("Msg", equalTo("successfully added"))
				.extract().response();

		// just to see output
		String printRes = res.asString();
		System.out.println(printRes);

		String id = ReusableM.rawToJson(res).get("ID");

		Response re = given().body("{ \"ID\": \"" + id + "\" } ").when().delete(p.getProperty("DELETE2")).andReturn()
				.then().statusCode(200).and().contentType(ContentType.JSON).extract().response();

		String response = re.asString();
		System.out.println(response);
	}

	@DataProvider(name = "bookData")
	public Object[][] getdata() {
		return new Object[][] { { "yss", "21" }, { "yss", "33" }, { "yss", "54" } };

	}
}

/*
 * add and delete dynamic data set using object array ----------
 */
