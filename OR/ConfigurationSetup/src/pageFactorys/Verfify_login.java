package pageFactorys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verfify_login {
	
	WebDriver driver;
	@Test
	public void  check_login()
	
	{
		
		driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		
		PageLocators ologin=PageFactory.initElements(driver, PageLocators.class);
		
		ologin.login_wordpress("admin", "demo123");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "Invalid Crendetials");
		
		System.out.println("Page Title Verified Sucessfully" );
		
		
		
		
	}
	

}
