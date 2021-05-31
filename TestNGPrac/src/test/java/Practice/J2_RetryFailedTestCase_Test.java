
package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J2_RetryFailedTestCase_Test {
	
	@org.testng.annotations.Test(retryAnalyzer = Practice.J1_RetryFailedTestCase_RetryClass.class)
//This method is tedious if there are more test cases to run. If there are 500 tests, then we can't write
	//this line for all 500 tests. So, we don't use this method often
	public void Test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
		Assert.assertTrue(false);//Failing the test on purpose
		
		//Can also run the test from J_RetryFailedTest.xml

	}

}
