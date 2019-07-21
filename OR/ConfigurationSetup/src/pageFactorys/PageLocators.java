package pageFactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageLocators {
	
	
	WebDriver odriver;
	
	public PageLocators(WebDriver odriver)
	
	{
		
		this.odriver=odriver;
	}

	
	@FindBy(id="user_login") 
	WebElement userName;
	
	@FindBy(how=How.ID,using="user_pass")
	WebElement password;
	
	@FindBy(how=How.NAME,using="wp-submit")
	WebElement loginbutton;
	
	
	public void login_wordpress(String Uid,String pass)
	{
		userName.sendKeys(Uid);
		password.sendKeys(pass);
		loginbutton.submit();
		
		
	}
	
	
	
	
}
