package Page_ModelF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	

	@FindBy(id="user_login") 
	WebElement userName;
	
	@FindBy(how=How.ID,using="user_pass") 
	WebElement password;
	
	@FindBy(how=How.NAME,using="wp-submit")
	WebElement submit_button;
	
	public void login_wordpress(String uid,String pass)
	
	{
		userName.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.submit();
		
	}
	
	
}
