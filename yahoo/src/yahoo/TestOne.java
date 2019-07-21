package yahoo;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://yahoo.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
        Thread.sleep(1000);
        if (driver.findElement(By.xpath("//a[@id='login-signup']")).isDisplayed()){
        	driver.findElement(By.xpath("//a[@id='login-signup']")).click();	
        } 
//        else 
//          if(driver.findElement(By.xpath("//a[@id='login-signup']")).isDisplayed()){
//        	driver.findElement(By.xpath("//a[@id='login-signup']")).click();	
//          }
//        driver.findElement(By.xpath("//a[@id='login-signup']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("usernamereg-firstName")).sendKeys("ajay");
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("biswal");
        Select oselect=new Select(driver.findElement(By.id("usernamereg-month")));
        List <WebElement> element=oselect.getOptions();
        for (int i=1;i<element.size();i++){
         	System.out.println(element.get(i).getText());
         	String sMonth=element.get(i).getText();
         	if(sMonth.equals("June")){
         		oselect.selectByIndex(i);
         		break;
         	}
         	     	 	
         }
        driver.findElement(By.id("usernamereg-day")).sendKeys("28");
        driver.findElement(By.id("usernamereg-year")).sendKeys("1982");
        driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("Male");
       
        	
//        Select ogender=new Select(driver.findElement(By.id("usernamereg-year")));
//        List<WebElement> ogens=ogender.getOptions();
//        for (int k=1; k<ogens.size();k++){
//        	if(ogens.get(k).getText().equals("Male")){
//        		ogender.selectByIndex(k);
//        		break;
//        	}
//        }
 //       	driver.close();
        
        
        
        
        
        
        
        
		
		
		
		
		
				

	}

}
