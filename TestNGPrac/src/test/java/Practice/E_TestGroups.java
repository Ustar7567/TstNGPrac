package Practice;

import org.testng.annotations.Test;
@Test(groups="kjh") //all the tests under the class are combined into a single group-class level grouping
public class E_TestGroups {
	
	@Test(groups="one")
	public static void Tst1() {
		System.out.println("tst1");
	}
	@Test(groups="two")
	public static void Tst2() {
		System.out.println("tst2");
	}
	@Test(groups={"one","two"})//This test is a part of both group one and two
	public static void Tst3() {
		System.out.println("tst3");
	}
	@Test(groups="two")
	public static void Tst4() {
		System.out.println("tst4");
	}
	//How to run? Right click-run as-run configurations-groups-select the groups u want to test

}
