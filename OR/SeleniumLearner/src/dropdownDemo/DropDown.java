package dropdownDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DropDown {
	@Test
	public void selectDDvalues() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath(".//*[@id='month']"));
	
	    Select d=new Select(ele);
	    WebElement d1=d.getFirstSelectedOption();
	    System.out.println("Before selecting the value is: "+d1.getText());
	    Thread.sleep(3000);
		d.selectByIndex(4);//mar
		WebElement d2=d.getFirstSelectedOption();
		System.out.println("AFTER selecting the value is: "+d2.getText());
		Thread.sleep(3000);
		d.selectByValue("11");//nov
		d.selectByVisibleText("Jan");
		
		
	}
		

	}


