package Reqres.Practice10;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.given;

import java.util.List;

public class GetRequest {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";
		
		ResponseBody s = given().queryParam("page", "2").expect().defaultParser(Parser.JSON)
				.when().get("/api/users").as(ResponseBody.class);
		
		List<Data> Data = s.getData();
		int size =Data.size();
		
		for(int i=0;i<size;i++) {
			System.out.println(Data.get(i).getFirst_name());
			System.out.println(Data.get(i).getLast_name());
		}
	}	
}