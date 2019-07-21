package iFrameDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo {
	
	@Test
	public void TestFrame() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		 
		driver.get("file:///C:/Users/ajayb4/Desktop/SeleniumFrame.html");
		
      int Totaltabs= driver.findElements(By.tagName("iframe")).size();
      
      System.out.println("Total no.of tab.."+Totaltabs);
      
      WebElement frame1=driver.findElement(By.xpath("//iframe[@title='selenium_news']"));
      
      driver.switchTo().frame(frame1);
      
	 driver.findElement(By.xpath(".//*[@id='menu_projects']/a")).click();
	 
	 Thread.sleep(5000);
	
//		driver.findElement(By.xpath(".//*[@id='pull']")).click();
		
//	driver.findElement(By.xpath("//span[@class='mobile_menu_bar mobile_menu_bar_toggle']")).click();
		
//		driver.findElement(By.xpath("//a[@title='LearnQTP Blog']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("html/body/a")).click();
	
//		WebElement frame1=driver.findElement(By.xpath("//iframe[@title='Main Content']"));
//		
//	    driver.switchTo().frame(frame1);
	    
//	    driver.findElement(By.id("user_name")).sendKeys("ahhd");
		
		
	}
	
	

}
