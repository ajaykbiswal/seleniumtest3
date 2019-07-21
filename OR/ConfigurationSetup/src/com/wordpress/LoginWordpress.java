package com.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWordpress 
{
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.id("user_pass");
	By clicktologinbutton=By.name("wp-submit");
	

	public LoginWordpress(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void VerifyLogin(String userid,String pass)
	{
		
		driver.findElement(username).sendKeys(userid);
	    driver.findElement(password).sendKeys(pass);
	    driver.findElement(clicktologinbutton).submit();
			
	}

}
