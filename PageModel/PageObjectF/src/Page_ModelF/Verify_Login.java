package Page_ModelF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Verify_Login {
	
	@Test
	public void Valid_login()
	
	{
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		
		login_page.login_wordpress("admin", "demo123");
		
	}

}
