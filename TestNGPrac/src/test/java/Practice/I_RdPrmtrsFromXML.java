package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//Run the program from xml file "I_RdPrmtrsFromXML.xml" (Right click->run as->testNG Suite
public class I_RdPrmtrsFromXML {
	
	public static WebDriver driver;
	
	@Parameters({"browser"})//takes browser value from the external file. In this case, "I_RdPrmtrsFromXML.xml"
	@Test
	
	public void OpenGgl(String browser) throws InterruptedException {//String browser parameter must be added in argument
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		} //can add as many else if blocks as we want based on how many browser options we need to hv.Like firefox, opera, safari, IE etc.,
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Test pass");
	}

}
