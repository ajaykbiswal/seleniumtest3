package DEMO1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class savebtn {

	@Test
	public static void Test1() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("ajayk123");
		
		driver.findElement(By.name("password")).sendKeys("ajayk123");
		
		driver.findElement(By.xpath("//input[@value='Login']")).submit();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		
//		Actions action=new Actions(driver);
//		
//		WebElement ele=driver.findElement(By.xpath("//a[@title='Contacts']"));
//		action.moveToElement(ele).click();
		
		boolean flag=driver.findElement(By.xpath("//td[@class='datalistrow']//a[text()='David Miller']")).isDisplayed();
		
		System.out.println(flag);
		
		Assert.assertTrue(flag);
		
//		action.moveToElement(ele).perform();
//		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
//		
//		List<WebElement> olist=driver.findElements(By.xpath("//input[@type='submit' and @value='Save']"));
//		
//		System.out.println(olist.size());
//		
//		for(int i=0;i<olist.size();i++){
//			
//			int x=olist.get(i).getLocation().getX();
//			
//			if(x!=0){
//				
//				olist.get(i).click();
//				break;
//			}
//		}
		
		
      
       
       
		
	}

}
