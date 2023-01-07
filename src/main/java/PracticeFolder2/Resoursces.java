package PracticeFolder2;

public class Resoursces {
	
	
	public String post(String xml) {	
		String xy ="xml";
		if(xy.equalsIgnoreCase(xml)) {
			return "maps/api/place/add/xml";
		}else {
			return "maps/api/place/add/json";
		}
	}
	
	public String delete(String xml) {	
		String xy = "xml";
		if(xy.equalsIgnoreCase(xml)) {
			return "maps/api/place/delete/xml";
		}else {
			return "maps/api/place/delete/json";
		}
	}
	
}


/* traditional one
 * 
 * public static String post() {
		return "maps/api/place/add/json";
	}
	public static String delete() {
		return "maps/api/place/delete/json";
	}
 */

