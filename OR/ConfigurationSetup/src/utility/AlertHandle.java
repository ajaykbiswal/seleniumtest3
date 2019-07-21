package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
	
		driver.get("http://www.busindia.com/busindia_OSRTC.jsp");
		
		try{
			driver.switchTo().alert().accept();
			
			
		}
		catch(NoAlertPresentException e){
			
			System.out.println(e.getMessage());
			
		}
		
		driver.findElement(By.xpath(".//*[@id='dvOnwardAndReturnTrip']/button")).click();
		
		
		
	}
	
	

//	public static void AlertHandler(WebDriver ldriver){
//		
//		if(isAlertPresent(ldriver)){
//			ldriver.switchTo().alert().getText();
//			
//			ldriver.switchTo().alert().dismiss();
//			
//			ldriver.close();
//		}
//	}
//	
//	
//	public static boolean isAlertPresent(WebDriver ldriver){
//		
//		try{
//			ldriver.switchTo().alert();
//			return true;
//		}
//		catch(NoAlertPresentException e){
//			
//			System.out.println(e.getMessage());
//			return false;
//		}
//	}
//	
}
