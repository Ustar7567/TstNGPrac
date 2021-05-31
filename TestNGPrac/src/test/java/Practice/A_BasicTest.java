package Practice;

import org.testng.annotations.Test;

public class A_BasicTest {
	
	@Test(priority=1,description="This is login test")
	
	public static void bLogintst() {
		System.out.println("Login is successful");
	}
	@Test(priority=2,description="This is logout test")
	
	public static void aLogouttst() {
		System.out.println("Logout is successful");
	}

}
