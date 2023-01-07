package Reqres.Practice11;


import static io.restassured.RestAssured.given;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class GetReq {
	
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";
		Response1 r1=given().expect().defaultParser(Parser.JSON).
		when().get("/api/unknown").as(Response1.class);
		
	//	System.out.println(r1.getData().get(1).getColor());
		List<Data> data = r1.getData();
		
		int si =data.size();
		
	for(int i=1;i<si;i++) {
		System.out.println(data.get(i).getName());
		System.out.println(data.get(i).getColor());
	}
	}
}
