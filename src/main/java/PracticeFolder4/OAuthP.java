package PracticeFolder4;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PracticeFolder2.ReusableM;

import static io.restassured.RestAssured.given;

public class OAuthP {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Study Material\\selenium\\chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver(); driver.get(
		 * "https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php"
		 * ); driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys(
		 * "yogi150400");
		 * driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys(Keys.
		 * ENTER); Thread.sleep(3000);
		 * driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys(
		 * "5490ardnegoy");
		 * driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys(Keys.
		 * ENTER); Thread.sleep(4000);
		 */
		// String url = driver.getCurrentUrl();

		String url = "";
		String code = url.split("code=")[1];
		String partilcode = code.split("&scope")[0];

		Response res = given().queryParams("code", partilcode).urlEncodingEnabled(false)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type", "authorization_code").when()
				.post("https://www.googleapis.com/oauth2/v4/token").andReturn().then().extract().response();

		JsonPath js = ReusableM.rawToJson(res);
		String scc = js.get("access_token");

		Response re = given().queryParam("access_token", scc).log().all().when()
				.get("https://rahulshettyacademy.com/getCourse.php").andReturn().then().statusCode(200).and()
				.contentType(ContentType.HTML).extract().response();

		String sc = re.asString();
		System.out.println(sc);
	}

}
