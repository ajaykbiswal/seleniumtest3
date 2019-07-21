package ecom_ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Ebay_PageLoactor 
{
	
	WebDriver driver;
	public Ebay_PageLoactor(WebDriver odriver)
	{
		
		this.driver=odriver;
		
	}
	
@FindBy(id="user_login")
WebElement userName;

@FindBy(how=How.ID,using="user_pass")
WebElement password;
	
@FindBy(how=How.NAME,using="wp-submit")
WebElement login_button;

public void login(String uid,String pass){
	
	userName.sendKeys(uid);
	password.sendKeys(pass);
	login_button.submit();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
