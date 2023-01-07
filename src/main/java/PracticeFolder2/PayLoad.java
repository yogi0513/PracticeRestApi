package PracticeFolder2;

public class PayLoad {

	public static String body() {
		String str= "    {   \r\n"
				+ "    \"location\":{  \r\n"
				+ "       \"lat\" : -38.383494, \r\n "
				+ "       \"lng\" : 33.427362   \r\n "
				+ "    },    \r\n"
				+ "    \"accuracy\":50,  \r\n "
				+"    \"name\":\"Yogendra burkul\", \r\n "
				+"    \"phone_number\":\"(+91) 983 893 3937\",  \r\n "
				+"    \"address\" : \"29, side layout, cohen 09\", \r\n "
				+"    \"types\": [\"shoe park\",\"shop\"],   \r\n "
				+"    \"website\" : \"http://google.com\", \r\n  "
				+"    \"language\" : \"French-IN\"  \r\n "
				+"     } ";
		return str;
	}
	
	public static String bodyXml() {
		
		String x = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n"
				+ "<root>\r\n"
				+ "    <location>\r\n"
				+ "        <lat>-38.383494</lat>\r\n"
				+ "        <lng>33.427362</lng>\r\n"
				+ "    </location>\r\n"
				+ "    <accuracy>50</accuracy>\r\n"
				+ "    <name>The Mens store</name>\r\n"
				+ "    <phone_number>(+91) 983 893 3937</phone_number>\r\n"
				+ "    <address>Anna Salai, Chennai</address>\r\n"
				+ "    <types>shoe park</types>\r\n"
				+ "    <types>kadai</types>\r\n"
				+ "    <website>http://google.com</website>\r\n"
				+ "    <language>tamil-IN</language>\r\n"
				+ "</root>\r\n"
				+ "";
		return x;
	}	
	
}
