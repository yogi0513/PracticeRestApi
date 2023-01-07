package Reqres.Practice10;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

public class SingleUser {
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";
		SingleRespBody s1 = given().expect().defaultParser(Parser.JSON).
				when().get("/api/users/2").as(SingleRespBody.class);

		Data1 data = s1.getData();
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(data.getId());
		al.add(data.getFirst_name());
		al.add(data.getLast_name());
		al.add(data.getEmail());
		al.add(data.getAvatar());
			
		for(Object ele:al) {
			System.out.println(ele);
		}
		
	
	}
}
