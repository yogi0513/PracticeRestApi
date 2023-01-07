package PracticeFolder3;

public class PayLoad2 {

	public String addBook(String a, String b) {
		String payload = "{\r\n\r\n\"name\":\"Learn Appium Automation with Java\","
				+ "\r\n\"isbn\":\""+a+"\",\r\n\"aisle\":\""+b+"\",\r\n\"author\":\"John foe\"\r\n}\r\n";
		return payload;
	}
	
	
	public static String addBook1(String a, String b) {
		String payload ="   {   \r\n "
						+"   \"name\":\"Learn Appium Automation\", \r\n "
						+"   \"isbn\":\"" + a +  "\",   \r\n "
						+"   \"aisle\":\"" + b +   "\",   \r\n  "
						+"   \"author\":\"Yogendra Bukul\"   \r\n   "
						+"    }   ";
		return payload;
	}
	
	
	
	
	
}
