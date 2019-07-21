package PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyLogin {
	
	WebDriver driver;
	
	@Test
	public void checkLogin_ValidUser()
	{
		
	 driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
	
	 PageObjectList ologin=PageFactory.initElements(driver, PageObjectList.class);
	 
	 ologin.login_wordpress("admin", "demo123");
	 
	 Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User Unable to login with Invaild Credentials");
	 
	 System.out.println("Page Title Verified Scussesfully");
		
	ologin.post_button();
	
	ologin.add_buttons();
	
	ologin.post_title("Hey I am Here Guys!");
	
	ologin.Verify_Msg_Title();

	
	
	

		
	}

}
