package PracticeFolder3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LibDynamPrac {

	@Test (dataProvider ="bookData")
	public void test1() {
		
	}
	
	
	
	@DataProvider (name = "bookData")
	public Object [][] data() {
		return new Object [][] {};
	}
}
