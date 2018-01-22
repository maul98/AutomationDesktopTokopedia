package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

//import library.utility;
import library.utility2;

public class StoreActivationIntools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize browser
        
        //Open Live
        	driver.get("https://internal.tokopedia.com/officialstore/activation");
            driver.findElement(By.id("inputEmail")).sendKeys("maulana.hasim@tokopedia.com");
            Thread.sleep(1000);
            utility2.captureScreenshoot(driver, "InputUsername"); //screenshoot input username
            driver.findElement(By.id("inputPassword")).sendKeys("indonesia");
            Thread.sleep(1000);
            utility2.captureScreenshoot(driver, "InputPassword"); //screenshoot input Password
            driver.findElement(By.id("email_btn")).click();
            
          //verify text Username Intools
            String expectedMessage = "Maulana Hasim";
            String message = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/ul/li/a/div/div/span")).getText();
            AssertJUnit.assertTrue(message.contains(expectedMessage));
            System.out.println("Ekspektasi User Profile name = " +expectedMessage+"\n");
            System.out.println("Result Profile name = "+message+"\n");
            
            Thread.sleep(3000);
            driver.get("https://internal.tokopedia.com/officialstore/activation");
            Thread.sleep(1000);
            utility2.captureScreenshoot(driver, "OpenIntoolsStoreActivation"); //screenshoot open intools store activation
            driver.findElement(By.id("filter-toggle")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("search_shop_domain")).sendKeys("zeldasquad");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "InputDomain1"); //screenshoot input domain1
            driver.findElement(By.xpath("//*[@id=\"filter-form\"]/div/div[2]/button")).click();
            Thread.sleep(3000);
            utility2.captureScreenshoot(driver, "ResultSearchDomainBeforeOS"); //screenshoot Result domain sebelum OS
            
          //verify text domain
            String expectedMessage1 = "zeldasquad";
            String message1 = driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr/td[2]/p[2]")).getText();
            AssertJUnit.assertTrue(message1.contains(expectedMessage1));
            System.out.println("Ekspektasi Domain = " +expectedMessage1+"\n");
            System.out.println("Result Domain = "+message1+"\n");
            
        //Set as Official
            driver.findElement(By.id("set-official")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("set_start_date")).sendKeys("06/08/2018");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "InputStartDate"); //screenshoot input start date
            driver.findElement(By.id("set_expire_date")).sendKeys("12/10/2019");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "InputEndDate"); //screenshoot input end date
            driver.findElement(By.id(" ")).sendKeys("shinvanni.theodore@tokopedia.com");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "InputAdminBPO"); //screenshoot input admin BPO
            driver.findElement(By.id("set_pkp")).click();
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "InputPKP"); //screenshoot input PKP
            driver.findElement(By.id("bpo_email")).sendKeys("maulana.hasim@tokopedia.com");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "InputEmailTokopedia"); //screenshoot input email tokopedia
            Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"set-activation-form\"]/div[1]/center/div/table/tbody/tr[7]/td[2]/select")));
            dropdown.selectByIndex(3);
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "InputCategory"); //screenshoot input category
            driver.findElement(By.xpath("//*[@id=\"set-activation-form\"]/div[2]/div/button")).click();
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "SuccessSetOS"); //screenshoot Success set OS
            
          //verify Success set OS
            String expectedMessage2 = "Successfully added new official store";
            String message2 = driver.findElement(By.xpath("//*[@id=\"osactivationpage\"]/div[4]/h2")).getText();
            AssertJUnit.assertTrue(message2.contains(expectedMessage2));
            System.out.println("Ekspektasi Message Success = " +expectedMessage2+"\n");
            System.out.println("Result Message Success = "+message2+"\n");
            
            driver.findElement(By.xpath("//*[@id=\"osactivationpage\"]/div[4]/div[7]/div/button")).click();
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "ResultSuccessOS"); //screenshoot Result Success set OS
            
            
          //verify text Status 
            String expectedMessage3 = "Official Store";
            String message3 = driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr/td[2]/p[3]")).getText();
            AssertJUnit.assertTrue(message3.contains(expectedMessage3));
            System.out.println("Ekspektasi Status = " +expectedMessage3+"\n");
            System.out.println("Result Status = "+message3+"\n");
            
          //Open Shop Page      
            driver.get("https://www.tokopedia.com/zeldasquad");
            Thread.sleep(3000);
            utility2.captureScreenshoot(driver, "ShopPageOS"); //screenshoot Shop Page OS
            
          //Edit Official
            driver.get("https://internal.tokopedia.com/officialstore/activation");
            Thread.sleep(1000);
            driver.findElement(By.id("filter-toggle")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("search_shop_domain")).sendKeys("zeldasquad");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"filter-form\"]/div/div[2]/button")).click();
            Thread.sleep(2000);
            
            driver.findElement(By.id("edit-official")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("set_start_edit_date")).clear();
            Thread.sleep(1000);
            driver.findElement(By.id("set_start_edit_date")).sendKeys("12/09/2018");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "EditStartDate"); //screenshoot Edit Start Date
            driver.findElement(By.id("set_expire_date_edit")).clear();
            Thread.sleep(1000);
            driver.findElement(By.id("set_expire_date_edit")).sendKeys("01/01/2020");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "EditEndDate"); //screenshoot Edit End Date 
            driver.findElement(By.id(" ")).clear();
            Thread.sleep(1000);
            driver.findElement(By.id(" ")).sendKeys("ferdinand.kurniawan@tokopedia.com");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "EditBPOadmin"); //screenshoot edit bpo admin 
            driver.findElement(By.id("bpo_email")).clear();
            Thread.sleep(1000);
            driver.findElement(By.id("bpo_email")).sendKeys("alfadilah.aulya@tokopedia.com");
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "EditEmailTokopedia"); //screenshoot Email Tokopedia
            driver.findElement(By.xpath("//*[@id=\"edit-activation-form\"]/div[2]/div/button")).click();
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "SuccessEditOS"); //screenshoot Success Edit OS
            
            //verify Success edit OS
            String expectedMessage4 = "Successfully edit data official store";
            String message4 = driver.findElement(By.xpath("//*[@id=\"osactivationpage\"]/div[4]/h2")).getText();
            AssertJUnit.assertTrue(message4.contains(expectedMessage4));
            System.out.println("Ekspektasi Message Success Edit = " +expectedMessage4+"\n");
            System.out.println("Result Message Success Edit = "+message4+"\n");
            
            
            driver.findElement(By.xpath("//*[@id=\"osactivationpage\"]/div[4]/div[7]/div/button")).click();
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "ResultEditOS"); //screenshoot Result Edit OS
            
            
          //verify text Status 
            String expectedMessage5 = "Official Store";
            String message5 = driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr/td[2]/p[3]")).getText();
            AssertJUnit.assertTrue(message5.contains(expectedMessage5));
            System.out.println("Ekspektasi Status After Edit = " +expectedMessage5+"\n");
            System.out.println("Result Domain After Edit = "+message5+"\n");
            
          //Open Shop Page  
            driver.get("https://www.tokopedia.com/zeldasquad");
            Thread.sleep(3000);
            utility2.captureScreenshoot(driver, "ShopPageAfterEdit"); //screenshoot Shop Page after Edit
            
         //Hapus Official
            driver.get("https://internal.tokopedia.com/officialstore/activation");
            Thread.sleep(1000);
            driver.findElement(By.id("filter-toggle")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("search_shop_domain")).sendKeys("zeldasquad");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"filter-form\"]/div/div[2]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("remove-official")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"osactivationpage\"]/div[3]/div[7]/div/button")).click();
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "PopUpDeleteOS"); //screenshoot PopUp Delete OS
            
          //verify text delete success 
            String expectedMessage6 = "Successfully remove the official store";
            String message6 = driver.findElement(By.xpath("//*[@id=\"osactivationpage\"]/div[3]/h2")).getText();
            AssertJUnit.assertTrue(message6.contains(expectedMessage6));
            System.out.println("Ekspektasi Message Success Delete = " +expectedMessage6+"\n");
            System.out.println("Result Message Success Delete = "+message6+"\n");
            
            driver.findElement(By.xpath("//*[@id=\"osactivationpage\"]/div[3]/div[7]/div/button")).click();
            Thread.sleep(2000);
            utility2.captureScreenshoot(driver, "SuccessDeleteOS"); //screenshoot Success Delete OS          
            
          //verify text Status 
            String expectedMessage7 = "Gold Merchant";
            String message7 = driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr/td[2]/p[3]")).getText();
            AssertJUnit.assertTrue(message7.contains(expectedMessage7));
            System.out.println("Ekspektasi Status After Delete = " +expectedMessage7+"\n");
            System.out.println("Result Domain After Delete = "+message7+"\n");
            
          //Open Shop Page  
            driver.get("https://www.tokopedia.com/zeldasquad");
            Thread.sleep(3000);
            utility2.captureScreenshoot(driver, "ShopPageAfterDeleteOS"); //screenshoot Shop Page after delete
            driver.quit();
		
	}
	
}

