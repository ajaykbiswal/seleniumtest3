import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.*; 


public class YahooOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("http://Yahoo.com");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.linkText("Sign up")).click();
//		driver.findElement(By.name("firstName")).sendKeys("Ajay");
//		driver.findElement(By.name("lastName")).sendKeys("Adjay");
//		Select oselect=new Select(driver.findElement(By.name("mm")));
//		List<WebElement> element=oselect.getOptions();
//		 for (int i=1;i<element.size();i++){
//			 String smonth=element.get(i).getText();
//			  if(smonth.equals("July")){
//				  oselect.selectByIndex(i);
//				  break;
//				  
//			  }
//			 
//		 }
//
//		 driver.findElement(By.name("dd")).sendKeys("25");
//		 driver.findElement(By.name("yyyy")).sendKeys("1890");
//		 driver.findElement(By.name("freeformGender")).sendKeys("Male");
		
		
		
		
		
		driver.get("http://www.ebay.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.linkText("Mobile & Accessories"));
		Actions builder=new Actions(driver);
		builder.moveToElement(element).build().perform();
		builder.moveToElement(element).click().perform();
		Thread.sleep(500);
		List<WebElement> links=driver.findElements(By.className("asptit"));
		for(WebElement link:links){
			if(link.getText().equals("Nokia")){
				links.get(0).click();
				break;		
			}
			
		}
		
		Select oselect=new Select(driver.findElement(By.id("gh-cat")));
		List<WebElement> dropbox=oselect.getOptions();
		 for(int i=1;i<dropbox.size();i++){
//				String svalue= dropbox.get(i).getText();
			 
				assertEquals("eBay Daily",oselect.getFirstSelectedOption().getText());
//				if(svalue.equals("eBay Daily")){
					oselect.selectByIndex(i);
					
//				}
			 
		 }
		
				
		 
		 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
