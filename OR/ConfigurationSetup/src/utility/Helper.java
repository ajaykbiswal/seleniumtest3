package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper 
{
	
	public static void HightlightElement(WebDriver driver,WebElement element) 	{
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		je.executeScript("arguments[0].setAttribute('style','background:yellow')", element);
		
		
//		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		 
		
       
	 
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
			System.out.println(e.getMessage());
			
		}
		
		je.executeScript("arguments[0].setAttribute('style','border:solid white')", element);
		
		je.executeScript("arguments[0].setAttribute('style','border:solid white');", element);
		
//		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
		
	}
	

}
