package dropDownDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class eBay_RadioButton_Selection {
	WebDriver driver;
   @Test
	public void  DropDownValue_Selection() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120000, TimeUnit.SECONDS);
		driver.get("http://www.ebay.in/");
			
	driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	
//    List<WebElement> olists=driver.findElements(By.xpath("//table[@id='gh-sbc']/tbody/tr/td/h3/a"));
    
    List<WebElement> olists=driver.findElements(By.xpath("//table[@id='gh-sbc']/tbody/tr/td/ul/li/a"));
    
    
    for (WebElement ele:olists)
    {
    	
    	
    	if(ele.getAttribute("innerHTML").contentEquals("Pen Drives"))
    	{
    		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    		ele.click();
    		break;
    	}
    	
    }
    List<WebElement> oformats=driver.findElements(By.xpath("//input[@name='LH_BuyingFormats'and @type='radio']"));
    
    
    for(WebElement oles:oformats)
    {
    	System.out.println(oles.getAttribute("value"));
    	
    	if(oles.getAttribute("value").contentEquals("LH_BIN"))
    	{
    		oles.click();
    	}
    	
    }
    
    
List<WebElement> ocapacity=driver.findElements(By.xpath("//input[@name='Capacity' and @type='checkbox']"));

    
    for(WebElement c:ocapacity)
    {
    	System.out.println(c.getAttribute("id"));
    	
    	if(c.getAttribute("id").contentEquals("e1-33"))
    	{
    		c.click();
    	}
    	
    }

    
}
  

}