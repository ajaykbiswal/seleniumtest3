package TestDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Wordpresslogin {
	
	
	WebDriver driver;
	ConfigDemo reader;
	
	@BeforeTest
	public void Setup(){
		
		reader=new ConfigDemo();
		System.setProperty("webdriver.chrome.driver", reader.getchromepath());
		System.out.println("SetUp...Ready!");
		
	}
	
	@Test(dataProvider="wordpress")
	public void logintest(String username,String password){
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(reader.getAppUrl());
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.name("wp-submit")).submit();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("Following"),"User Unable to Login with invalid credentials");
		System.out.println("Page Title Verified Successfully");
		
	}
    @AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	
	@DataProvider(name="wordpress")
	public Object[][] inputdata()
	{
		
		Excelcalling excel=new Excelcalling(reader.getexcelpath());
		int rows=excel.getrowcount(0);
		System.out.println(rows);
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++){
			
			data[i][0]=excel.getdata(0, i, 0);
			data[i][1]=excel.getdata(0, i, 1);
		}
		
		return data;
	}
	
	
	
	
	
}
