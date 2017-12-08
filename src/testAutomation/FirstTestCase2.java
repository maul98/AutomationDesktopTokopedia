package testAutomation;

import org.apache.commons.io.FilenameUtils;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.bcel.classfile.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.utility;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tokopedia.com/");
		driver.manage().window().maximize();
		utility.captureScreenshoot(driver, "OpenTokopediaHomepage");
		
		try {
			driver.get("https://accounts.tokopedia.com/authorize?client_id=1001&p=https%3A%2F%2Fwww.tokopedia.com&redirect_uri=https%3A%2F%2Faccounts.tokopedia.com%2Fappauth%2Fcode&response_type=code&state=eyJyZWYiOiJodHRwczovL3d3dy50b2tvcGVkaWEuY29tLyIsInV1aWQiOiIxZmQzMDE2MS0zYWJlLTRjNGQtOGE3OC1kMjE4ZjZlMjhjYzAifQ&cap=off");
		    Thread.sleep(5000);
		} catch (Exception e) {
		   
		}
		utility.captureScreenshoot(driver, "AccountPageLogin");
		
		driver.findElement(By.id("inputEmail")).sendKeys("maulana.hasim@tokopedia.com");
		utility.captureScreenshoot(driver, "inputEmail");
		driver.findElement(By.id("inputPassword")).sendKeys("indonesia");
		utility.captureScreenshoot(driver, "inputPassword");
		driver.findElement(By.id("email_btn")).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		   
		}
		utility.captureScreenshoot(driver, "HomepageTokopedia");
		driver.quit();
		
	}
	
}
