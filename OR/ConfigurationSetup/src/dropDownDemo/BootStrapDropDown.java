package dropDownDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> olist=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		
		for(WebElement ele:olist)
		{
			
			String innerhtml=ele.getAttribute("innerHTML");
			
			if(innerhtml.contentEquals("JavaScript"))
			{
				ele.click();
				break;
			}
			System.out.println("Values form DropDown... "+innerhtml);
		}
		
		driver.quit();
			
			
			
			
			
		
		
		

	}

}
