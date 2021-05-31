package Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_B4TstAftTst_B4MethodAftMethod {
	@BeforeMethod
	public static void DBCnct() {
		System.out.println("Connected to DB");
	}
	@AfterMethod
	public static void DBDiscnct() {
		System.out.println("Disconnected from DB");
	}
	
	@BeforeTest	
	public static void lgin() {
		System.out.println("Login successful");
	}
	@AfterTest
	public static void lgot() {
		System.out.println("Logout successful");
	}
	@Test(priority=1,description="Test 1")
	public static void tst1() {
		System.out.println("I am at test1");
	}
	@Test(priority=2,description="Test 2")
	public static void tst2() {
		System.out.println("I am at test2");
	}

}
