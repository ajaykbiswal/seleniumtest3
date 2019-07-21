package multwndhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/");
		String parentwnd=driver.getWindowHandle();
		driver.findElement(By.cssSelector("a[href*='http://www.google.com']")).click();
		Set<String> allwnd=driver.getWindowHandles();
		
		for(String s1:allwnd){
			String child_wnd=s1;
			if(!parentwnd.equalsIgnoreCase(child_wnd)){
				
			    driver.switchTo().window(child_wnd);
			    driver.findElement(By.cssSelector("#lst-ib")).sendKeys("selenium");
			    driver.findElement(By.cssSelector("input[value='Google Search']")).submit();
//			    driver.close();
				
			}
			
			
		}
		
		driver.switchTo().window(parentwnd);
		
		

	}

}
