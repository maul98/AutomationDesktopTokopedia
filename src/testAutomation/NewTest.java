package testAutomation;

import org.testng.annotations.Test;

import library.utility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {

  @Test 
	  @SuppressWarnings("deprecation")
		public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				driver.get("https://accounts.tokopedia.com/authorize?client_id=1001&p=https%3A%2F%2Fwww.tokopedia.com&redirect_uri=https%3A%2F%2Faccounts.tokopedia.com%2Fappauth%2Fcode&response_type=code&state=eyJyZWYiOiJodHRwczovL3d3dy50b2tvcGVkaWEuY29tLyIsInV1aWQiOiIxZmQzMDE2MS0zYWJlLTRjNGQtOGE3OC1kMjE4ZjZlMjhjYzAifQ&cap=off");
				driver.manage().window().maximize();
			    Thread.sleep(2000);

			utility.captureScreenshoot(driver, "AccountPageLogin");
			
			driver.findElement(By.id("inputEmail")).sendKeys("maulana.hasim@tokopedia.com");
			utility.captureScreenshoot(driver, "inputEmail");
			driver.findElement(By.id("inputPassword")).sendKeys("indonesia");
			utility.captureScreenshoot(driver, "inputPassword");
			driver.findElement(By.id("email_btn")).click();
			
				Thread.sleep(2000);
				
				driver.quit();
  }


}
