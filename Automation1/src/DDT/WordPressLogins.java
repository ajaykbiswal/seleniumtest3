package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelReadingTest.ExcelReadTest;

public class WordPressLogins {
	WebDriver driver;
	@Test(dataProvider="WordPressData")
	public void LogintoWordPress(String UName,String Password) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://demosite.center/wordpress/wp-login.php");
	  driver.findElement(By.id("user_login")).sendKeys(UName);
	  driver.findElement(By.id("user_login")).sendKeys(Password);
	  driver.findElement(By.id("wp-submit")).submit();
	  Thread.sleep(5000);
	  Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User Unable to Login with Invaild Credentials");
	  System.out.println("Page Title Verified scuccessfully");
	  
	}
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
    
    
	@DataProvider(name="WordPressData")
	public Object[][] passdata()
	{
	
	ExcelReadTest config=new ExcelReadTest("D:\\SeleniumTest\\Automation1\\TestData\\Exceldata.xlsx");
	int trows=config.getrowcount(0);
	System.out.println(trows);
	Object[][] data=new Object[trows][2];
	for(int i=0;i<trows;i++)
	{
	   data [i][0]=config.getData(0, i, 0);
	   data [i][1]=config.getData(0, i, 1);
	}
	return data;	
	
}
	
}
