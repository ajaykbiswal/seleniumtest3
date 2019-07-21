package DataCalendra;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		By checkin=By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon");
		
		By monthLabel=By.cssSelector(".monthTitle");
		
		By monthTable=By.cssSelector(".rb-monthTable.first.last");
		
		By dateElement=By.cssSelector(".day");
		
		By nextMonthButton=By.cssSelector(".next");
		
		String checkinMonth="Oct 2017";
		
		String checkinDate="22";
				
		String checkoutMonth="November 2017";
		
		String checkoutDate="12";
		
		
		//launch the Redbus
		
				
				
				Map<String, Object> prefs = new HashMap<String, Object>();
	              
                // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
 
                // Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();
 
                // Set the experimental option
		options.setExperimentalOption("prefs", prefs);
 
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		//Click on the Departbutton
		WebElement checkinElement=driver.findElement(checkin);
		checkinElement.click();
		
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.findElement(nextMonthButton).click();
		
		
		

	}

}
