package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelTest.ExcelConfig;

public class WordPressLogin {
	WebDriver driver;
	@Test(dataProvider="WordPressData")
	public void Logintowordpress(String UserName,String password)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(UserName);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).submit();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User Unable to Login with Invalid Credentitals");
        System.out.println("Page Title is verified sucessfully");
		
	}
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		
	}
	
 @DataProvider(name="WordPressData")
 public Object[][] inputpress(){
	 ExcelConfig config=new ExcelConfig("D:\\SeleniumTest\\ExcelTest1\\TestData\\Exceldata.xlsx");
	 int rows=config.TotalRows(0);
	 Object[][] data=new Object[rows][2];
	  for(int i=0;i<rows;i++){
		  data[i][0]=config.getdata(0, i, 0);
		  data[i][1]=config.getdata(0, i, 1);
	  }
	  
		return data;	 
 }
  
 
 
}
