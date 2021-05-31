package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_Assertions {
	
	@Test
	public static void TitleTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String exp="Google";
		String act=driver.getTitle();
		
		Assert.assertEquals(act, exp); //If this assertion fails, the execution doesn't proceed further. 
		//In this case, driver won't be closed. So, to overcome this, soft assertions are used to promote execution of 
		//further code even if an assertion fails. Refer to the next program for soft assertions.
		driver.close();		
	}
}
