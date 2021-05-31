package Practice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class F_SkipTestCases {
	
    static Boolean datasetupstatus=false;
	
	@Test(enabled=false) //This test won't even be recorded cz it's not ready for execution
	public static void one() {
		System.out.println("Skipping this test by giving enabled=false");
	}
	
	@Test
	public static void two() {
		System.out.println("Skipping by throwing exception");
		throw new SkipException("just skip");
	}
	
	@Test
	public static void three() {
		if(datasetupstatus==true) {
		System.out.println("Run three");
		}
		else {
			System.out.println("Skipping cz data set up is not done");
			throw new SkipException("Skippo");
		}	
	}
	
	@Test
	public static void run() {
		System.out.println("print");
	}

}
