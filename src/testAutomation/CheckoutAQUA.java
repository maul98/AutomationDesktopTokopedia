package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//import library.utility2;

public class CheckoutAQUA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize browser
        
        //Open Staging
        driver.get("https://staging.tokopedia.com/");
        System.out.println("Success open Tokopedia Staging");
        
        // Login as Buyer
            driver.findElement(By.id("login-ddl-link")).click();
            System.out.println("Success click on login button");
        //Open Iframe
            driver.switchTo().frame(0);
            driver.findElement(By.id("inputEmail")).sendKeys("maulana.hasim@tokopedia.com");
            driver.findElement(By.id("inputPassword")).sendKeys("indonesia");
            driver.findElement(By.id("global_login_btn")).click();
            driver.get("https://staging.tokopedia.com/");
            driver.get("https://staging.tokopedia.com/");
            //WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"side-profile\"]//*[@href=\"https://staging.tokopedia.com/people/5480767?nref=accside\"]"));
            //Assert.assertTrue(MyAccount.isDisplayed());
            //System.out.println("Success Login as Hana");
            Thread.sleep(3000);
            driver.get("https://staging.tokopedia.com/testingaqua");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"choose-address\"]/span/a/small/b")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"addr-4650738\"]/b")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("btn-atc")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"rf\"]/div/button")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"cart-review\"]/a/i")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("btn-checkout")).click();
            Thread.sleep(3000);
            //driver.findElement(By.id("scrooge_iframe")).isDisplayed();
            driver.switchTo().frame(0);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[6]/a[1]")).click();
            Thread.sleep(10000);
            driver.get("https://staging.tokopedia.com/tx_order_list.pl");
            Thread.sleep(5000);
            driver.quit();
		
	}
	
}

