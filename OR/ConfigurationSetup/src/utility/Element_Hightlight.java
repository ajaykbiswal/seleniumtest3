package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Hightlight {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		WebElement userName=driver.findElement(By.id("user_login"));
		
		Helper.HightlightElement(driver, userName);
		
		userName.sendKeys("demo");
		
		
		
		
	}

}
