package B4SuiteAfterSuiteAnnotationsDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class A_b4AftSuite {
	
	@BeforeSuite
	public static void dataSetUp() { //The classes test1 and test2 are extending this A_b4AftSuite class
		System.out.println("common data setup");
	}
	
	@AfterSuite
	public static void dataTearDown() {
		System.out.println("common data clean-up");
	}

}
