package Practice6;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Yogi"+generatedString);
	}
	
	public static String getUsername() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Yogi"+generatedString);
	
	}
}
