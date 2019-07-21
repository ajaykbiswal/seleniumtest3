package utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataPickerFrame {
	
	@Test
	public void DataPickerTest(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
	
		driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
		
		driver.findElement(By.cssSelector(".k-icon.k-i-calendar")).click();;
		
//		driver.findElement(By.cssSelector(".k-link k-nav-fast")).click();
		
		WebElement midLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));
		
		midLink.click();

		
//		WebElement oframe=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']"));
//		
//		
//		
//		driver.switchTo().frame(oframe);
//		
//		WebElement table=driver.findElement(By.className("ui-datepicker-calendar"));
//		
//		List<WebElement> tableRows=table.findElements(By.xpath("//tr"));
//		
//		for (WebElement row:tableRows)
//		{
//			
//			List<WebElement> cells=table.findElements(By.xpath("//td"));
//			
//			for(WebElement col:cells)
//			{
//				
//				if(col.getText().equals("20"));
//				{
//					driver.findElement(By.linkText("20")).click();
//				}
//				
//				
//			}
//		}
//	
//		
		
		
		
		
		
	}

}
