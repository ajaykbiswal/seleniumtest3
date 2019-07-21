package ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Factory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String brName,String url)
	
	{
		if(brName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(brName.equalsIgnoreCase("firfox"))
		{
			
			driver=new FirefoxDriver();
			
		}
		
		else if(brName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		else
		{
			System.out.println("Provide the Correct BrowserName ");
		}
			
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(120000, TimeUnit.SECONDS);
	
	driver.get(url);
	 
	return driver;
		
	}

}
