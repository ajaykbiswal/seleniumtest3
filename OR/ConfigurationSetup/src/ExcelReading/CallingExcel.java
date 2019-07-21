package ExcelReading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CallingExcel {
	
	Test_Configs readers;
	@BeforeTest
	public void  setup()
	{
		readers=new Test_Configs("./Configuration/Config.property");
		System.setProperty("webdriver.chrome.driver", readers.getDriver());
		
		
	}
	
	
	WebDriver driver;
	@Test(dataProvider="WordPress")
	public void login_Wordpress(String userName,String userPass)
	
	{

	
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(readers.getUrl());
		
		driver.findElement(By.id("user_login")).sendKeys(userName);
		
		driver.findElement(By.id("user_pass")).sendKeys(userPass);
		
		driver.findElement(By.name("wp-submit")).submit();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User Unable to login with Invalid Credentials");
		
		System.out.println("Page Title Verified Successfully");
				
		
	}

	@AfterMethod
    public void tearDown()
	{
		driver.quit();
	}

	
	@DataProvider(name="WordPress")
	public Object [][] inputdata()
	{
	
		ReadingExcel config=new ReadingExcel(readers.getExcelpath());
		
		int rows=config.getrowcount(1);
		
		Object[][] data= new Object [rows][2];
		
		for(int i=0;i<rows;i++)
		{
			
			data[i][0]=config.getData(1, i, 0);
			
			data[i][1]=config.getData(1, i, 1);
					
		}
				
			return data;
	}
	
}
