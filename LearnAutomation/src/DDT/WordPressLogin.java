package DDT;

import java.util.concurrent.TimeUnit;







import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {
	WebDriver driver;
	@Test(dataProvider="WordPressData")
	public void logintowordpress(String username,String Password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(Password);
		driver.findElement(By.id("wp-submit")).submit();
		Thread.sleep(5000); 
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User Unable to Login with Invalid Credentials");	
		System.out.println("Page Verified successfully");
		
	}
    @AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider (name="WordPressData")
	public Object[][] inputdata()
	{
		Object[][] data =new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";
		data[1][0]="admin";
		data[1][1]="demo123";
		data[2][0]="admin1";
		data[2][1]="demo1234";
		
		
		return data;
		
	}
	
}