package B4SuiteAfterSuiteAnnotationsDemo;

import org.testng.annotations.Test;

public class Test2 extends A_b4AftSuite{
	@Test(priority=3)
	public static void cone2() {
		System.out.println("one2");
	}
	@Test(priority=4)
	public static void dtwo2() {
		System.out.println("two2");
	}
	


}
