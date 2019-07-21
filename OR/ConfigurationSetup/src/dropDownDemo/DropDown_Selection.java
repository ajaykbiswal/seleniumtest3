package dropDownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown_Selection {
	
	@Test
	public void  DropDownValue_Selection() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement ele=driver.findElement(By.id("month"));
		Select omonth=new Select(ele);
		
		omonth.selectByIndex(3);
		 
		 Thread.sleep(2000);
		 
		 omonth.selectByValue("10");
		 
		 Thread.sleep(2000);
		
		 omonth.selectByVisibleText("Aug");		
	}

}
