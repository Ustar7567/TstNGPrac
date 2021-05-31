package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zzzzz_prac {
	
	@Test
	
	
	public static void Login() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("SSup?");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		String s= driver.getTitle();
		String exp="SSup? - Google Search";

		if(s.equals(exp)) {
			System.out.println("Test passed");
		}
		driver.close();
		
		
	}

}
