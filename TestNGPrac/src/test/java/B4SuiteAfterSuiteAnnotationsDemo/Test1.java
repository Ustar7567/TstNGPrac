package B4SuiteAfterSuiteAnnotationsDemo;

import org.testng.annotations.Test;

public class Test1 extends A_b4AftSuite{
	
	@Test(priority=1)
	public static void aone() {
		System.out.println("one");
	}
	@Test(priority=2)
	public static void btwo() {
		System.out.println("two");
	}
	

}
