package ecom_ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser (String BrowserName,String url) 
	{
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			
			driver=new ChromeDriver();
				
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		
		{
			
			driver=new FirefoxDriver();
			
			
		}
		
		else if(BrowserName.equalsIgnoreCase("IE"))
			
		{
			
			driver=new InternetExplorerDriver();
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(12000, TimeUnit.SECONDS);
		
		driver.get(url);
		
		return driver;
		
	}
	

}
