package Listeners;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class B_ListenerScrnsht implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Pass");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Screenshot captured");
		B_ScrnshtCode scr=new B_ScrnshtCode(); //Creating obj of B_ScrnshtCode class to use scrnsht() method
		try {
			scr.scrnsht();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test finished");
	}

}
