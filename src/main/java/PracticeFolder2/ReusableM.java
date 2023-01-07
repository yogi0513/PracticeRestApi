package PracticeFolder2;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableM {
	
	public static JsonPath rawToJson(Response res) {
		
		String responseString = res.asString();
		JsonPath js = new JsonPath(responseString);
			return js;
	}
	
	public static XmlPath rawToXml(Response res) {
		
		String responseString = res.asString();
		XmlPath xm = new XmlPath(responseString);
			return xm;
	}
	
}
