package iFrameDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		 
		driver.get("file:///C:/Users/ajayb4/Desktop/SeleniumFrame.html");
		
		int total_tabs=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total No.of Tabs is: "+total_tabs);
		
		WebElement ele=driver.findElement(By.xpath("//iframe[@title='selenium_news']"));
		
		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//*[@id='menu_projects']/a")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("html/body/a")).click();
		
		driver.quit();
		
		
		
		
		

	}

}
