package ecom_ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Ebay_Test {
	
	WebDriver driver;
	@Test
	public void Ebay_LoginTest()
	{
		
		driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		Ebay_PageLoactor ologin=PageFactory.initElements(driver, Ebay_PageLoactor.class);
		ologin.login("admin", "demo123");
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User Unable to login with Invaild Credentials");
		System.out.println("Page Title Verified Scussesfully");
	}
    
	@AfterMethod
	public void tearDown(){	
		
		driver.quit();
	}
	
	
	
	
	
}
