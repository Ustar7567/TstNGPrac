package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_SoftAssert {
	
	@Test
	
	public static void softAssert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		SoftAssert sa=new SoftAssert();
		String exp1="Google";
		String act1=driver.getTitle();
		sa.assertEquals(act1, exp1);
		WebElement we= driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		String act2=we.getTagName();
		String exp2="img";
		sa.assertEquals(act2, exp2);
		sa.assertAll(); //If we don't assert all, then if an assertion fails, it doesn't fail the test.
		driver.close();	
	}

}
