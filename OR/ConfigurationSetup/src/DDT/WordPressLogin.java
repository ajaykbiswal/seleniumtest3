package DDT;

import java.util.concurrent.TimeUnit;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestConfig.TestConfigFile;
import ExcelConfigfile.ExcelConfig;

public class WordPressLogin {
	
	WebDriver driver;
	TestConfigFile reader;
	
	@BeforeTest
	public void setup()
	
	{
		reader=new TestConfigFile();
		System.setProperty("webdriver.chrome.driver",reader.getChromePath());
		System.out.println("Congratulation! SetUp is Ready..!");
		
	}
	
   @Test(dataProvider="Demotest")
	public void Logintowordpress (String userName,String password)
   {
	   
	  
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(reader.getApplicationUrl());
		
		driver.findElement(By.id("user_login")).sendKeys(userName);
		
		driver.findElement(By.id("user_pass")).sendKeys(password);
		
		driver.findElement(By.id("wp-submit")).submit();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.getTitle().contains("Following ‹ Reader"), "User is unable to login-Invalid Credentials");
		
		System.out.println("Page Title Verified -User is able to login Successfully");
				
	}
    
   @AfterMethod
	public void tearDown(){
		
		driver.quit();
		
	}
	
	
	
	@DataProvider(name="Demotest")
	public Object[][] TestInput(){
		
//		TestConfigFile reader=new TestConfigFile();
		
		ExcelConfig config=new ExcelConfig(reader.getExcelPath());
		
		int rows=config.getRowcount(0);
		
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			
			data[i][0]=config.getData(0, i, 0);
			
			data[i][1]=config.getData(0, i, 1);
			
			
		}
		
		
		return data;
		
	}
	
}
	


