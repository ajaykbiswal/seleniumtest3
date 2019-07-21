package Page_ModelF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String brName,String url)
	
	{
		if(brName.equalsIgnoreCase("firfox")){
			
			driver=new FirefoxDriver();
			
		}
		else if(brName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			
        }
		
		else if(brName.equalsIgnoreCase("IE")){
//			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		return driver;
		
	}
	

}
