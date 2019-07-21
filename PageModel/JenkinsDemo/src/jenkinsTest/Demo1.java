package jenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test
	public void jenkinstestOne(){
		
		
		System.out.println("Welcome to jenkins World");
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}
