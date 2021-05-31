package Listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class B_ScrnshtCode extends B_LaunchBrowser{ //extending B_LaunchBrowser class to user 'driver' variable
	
	public void scrnsht() throws IOException {
		
		Date crntdt=new Date();
		String scrnshtFileNm=crntdt.toString().replace(" ", "-").replace(":", "-");
		System.out.println(scrnshtFileNm);
		
		File scrnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnsht, new File(".//B_ListenerScreenshot//"+scrnshtFileNm+".png"));

		
	}	
}
