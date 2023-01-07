package Practice9;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class annotationJson {
	
	@Test (dataProvider = "bookmyShow")
	public void test1(String a , String b) {
		
	}
	
	@DataProvider(name = "bookmyShow")
			public Object[][] data() {
			return new Object [] [] {{},{},{}};
	}
	
	
	

}
