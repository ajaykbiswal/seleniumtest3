package com.WordPressTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wordpress.LoginWordpress;

public class WordpressTestCase {
	
	@Test
	public void loginToWordpress(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginWordpress login=new LoginWordpress(driver);
		login.VerifyLogin("admin", "demo123");
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "Page Title not verified");
		System.out.println("Pagetitleverified");
		driver.quit();
			
		
		
	}

}
