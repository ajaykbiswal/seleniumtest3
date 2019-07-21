package dropDownDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

		List<WebElement>olists=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		
		for(WebElement ele:olists)
		
		{
			String radio=ele.getAttribute("id");
			
			if(radio.contentEquals("code"))
			{
				ele.click();
				break;
			}
			
			System.out.println("Value of the Radio Button...."+radio);
			
		}
		

	}

}
