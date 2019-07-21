package ebay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Ebay_Page_Locators {
	
	WebDriver driver;
	public Ebay_Page_Locators(WebDriver odriver)
	
	{
		this.driver=odriver;
		
	}

	@FindBy(xpath="//button[@id='gh-shop-a']") 
	WebElement shopBycatagory_button;
	
	@FindBy(how=How.XPATH,using="//table[@id='gh-sbc']/tbody/tr/td/ul/li/a")
	
	List<WebElement> shopBycatagory_links;
    

	
 @FindBy(how=How.XPATH,using="//input[@name='LH_BuyingFormats'and @type='radio']")
	
	List<WebElement> ebay_format;
 
 @FindBy(how=How.XPATH,using="//input[@name='Capacity'and @type='checkbox']")
 
 
	
	List<WebElement> ebay_capacity;
 

 
 @FindBy(how=How.XPATH,using="//input[@name='brand'and @type='checkbox']")
	
	List<WebElement> ebay_brand;
	
	public void shopCat_Click()
	{
		shopBycatagory_button.click();
		
	}
	
	public void shopCat_links()
	{
		
		for(WebElement ele:shopBycatagory_links)
		{
				
			if(ele.getAttribute("innerHTML").contentEquals("Pen Drives"))
			{
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				ele.click();
				break;
				
			}	
			
		}
	} 
	
	
	public void formats()
	{
		
		
		for(WebElement f:ebay_format)
		{
				
			if(f.getAttribute("value").contentEquals("LH_BIN"))
			{  
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

				f.click();
				
				
				
			}	
			
		}
	} 
	
	
	public void capacitys()
	{
		
		
		for(WebElement c:ebay_capacity)
		{
//			System.out.println(c.getAttribute("id"));	
			
			if(c.getAttribute("id").contentEquals("e1-33"))
			{
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				c.click();
				
				
			}	
			
		}
	} 
	
	
	
	public void brands()
	{
		
		
		for(WebElement b:ebay_brand)
		{
//			System.out.println(b.getAttribute("InnerHTML"));	
			
			if(b.getAttribute("id").contentEquals("e1-34"))
			{
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				
				b.click();
				
				break;
			}	
			
		}
	} 
	
	
	
	
	
	
	
}
