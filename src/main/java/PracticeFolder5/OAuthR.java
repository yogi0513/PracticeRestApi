package PracticeFolder5;

import static io.restassured.RestAssured.given;

import java.util.List;

import io.restassured.parsing.Parser;

public class OAuthR {
	
	public static void main(String[] args) {
		
		GetCourse response = given().queryParam("access_token", "--").expect().defaultParser(Parser.JSON).
				when().
			get("https://rahulshettyacademy.com/getCourse.php").as(GetCourse.class);
			
		response.getCourses().getWebAutomation().get(0).getCourseTitle();
		System.out.println(response.getInstructor());
		System.out.println(response.getExpertise());
		System.out.println(response.getCourses().getApi().get(0).getPrice());
		
	}	
}
