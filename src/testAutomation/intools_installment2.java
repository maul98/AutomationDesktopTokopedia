package testAutomation;

import org.apache.commons.io.FilenameUtils;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

import org.apache.bcel.classfile.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URI;
import java.net.URISyntaxException;

import library.utility;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class intools_installment2 {

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
		
			String expectedMessage1 = "Maulana Hasim";
			String message1 = driver.findElement(By.id("side-profile")).getText();
			Assert.assertTrue("Your Verify Text", message1.contains(expectedMessage1));
	

		driver.navigate().to("https://internal.tokopedia.com");;
		//driver.get("https://internal.tokopedia.com/");
	
			Thread.sleep(2000);
		
		driver.get(new URI(driver.getCurrentUrl()).resolve("officialstore/installment").toString());

			Thread.sleep(2000);

		utility.captureScreenshoot(driver, "HomepageIntoolsInstallment");
		
		driver.findElement(By.id("filter-toggle")).click();
		
		//search by os name / store
		driver.findElement(By.id("shop_name")).sendKeys("NUK Indonesia");
		driver.findElement(By.id("filter-search")).click();
	
			Thread.sleep(3000);
	
		utility.captureScreenshoot(driver, "ResultbyStore");
		
		//verify text result by store
		String expectedMessage = "NUK Indonesia";
		String message = driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[1]/td[2]")).getText();
		Assert.assertTrue("Your Verify Text", message.contains(expectedMessage));
		
		//clear search by os name / store
		driver.findElement(By.id("shop_name")).clear();
		driver.findElement(By.id("filter-search")).click();

			Thread.sleep(3000);

		
		//search by payment id
		driver.findElement(By.id("payment_id")).sendKeys("101048510");
		driver.findElement(By.id("filter-search")).click();

			Thread.sleep(3000);

		utility.captureScreenshoot(driver, "ResultbypaymentID");
		
		//verify text result by store
		String expectedMessage2 = "101048510";
		String message2 = driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[1]/td[3]")).getText();
		Assert.assertTrue("Your Verify Text is", message2.contains(expectedMessage2));
		
		//clear search by payment id
		driver.findElement(By.id("payment_id")).clear();
		driver.findElement(By.id("filter-search")).click();
	
			Thread.sleep(3000);

		driver.quit();
		
	}
	
}
