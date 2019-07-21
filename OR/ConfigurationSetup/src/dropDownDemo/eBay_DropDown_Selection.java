package dropDownDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class eBay_DropDown_Selection {
	
   @Test
	public void  DropDownValue_Selection() throws Exception{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120000, TimeUnit.SECONDS);
		driver.get("http://www.ebay.in/");
		
//		driver.findElement(By.xpath("//div[@id='gh-cat-box']")).click();
//		List<WebElement> olists=driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
//		for(WebElement ele:olists){
//			
//			String svalue=ele.getAttribute("innerHTML");
//			
//			System.out.println("Values are...."+svalue);
//		
//			
//		}
		
	driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	
//    List<WebElement> olists=driver.findElements(By.xpath("//table[@id='gh-sbc']/tbody/tr/td/h3/a"));
    
    List<WebElement> olists=driver.findElements(By.xpath("//table[@id='gh-sbc']/tbody/tr/td/ul/li/a"));
    
    
    for (WebElement ele:olists){
    	
    	
//    	String val=ele.getAttribute("innerHTML");
    	
    	if(ele.getAttribute("innerHTML").contentEquals("Pen Drives"))
    	{
    		
    		ele.click();
    		break;
    	}
    	
    }
		
	}

}
