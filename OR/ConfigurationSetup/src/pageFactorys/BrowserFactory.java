package pageFactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String brName,String Url)
	
	{
		if(brName.equalsIgnoreCase("chrome"))
		
		{   
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			
			
		}
		else if(brName.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
		}
		
		
		else if(brName.equalsIgnoreCase("IE"))
		{
			
			driver=new InternetExplorerDriver();
		}
		else 
		{
			System.out.println("Please provide the Correct Browser");
		}
		
		driver.manage().window().maximize();
		
		driver.get(Url);
		
		return driver;
	}

}
