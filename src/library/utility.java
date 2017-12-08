package library;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {

	public static void captureScreenshoot(WebDriver driver, String screenshootName)
	{
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(scrFile, new File("./captureInstalment/"+screenshootName+".jpg"));
			
			System.out.println("Screenshoot taken");
		
		} catch (Exception e) {
		
		System.out.println("Exception while taking screenshoot" +e.getMessage());
		}
	
	
	}
}
