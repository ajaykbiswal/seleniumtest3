package dropdowndemo2;

import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Dropdown2 {

	@Test
	public void SelectDD() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?");
		WebElement ele=driver.findElement(By.name("mm"));
		Select dropbox=new Select(ele);
		System.out.println("Before Selection the value is : "+dropbox.getFirstSelectedOption());
		dropbox.selectByIndex(4);
		Thread.sleep(3000);
		System.out.println("After Selection the value is :"+dropbox.getFirstSelectedOption().getText());
		dropbox.selectByValue("6");
		Thread.sleep(3000);
		System.out.println("After Selection the value is :"+dropbox.getFirstSelectedOption().getText());
	    
		dropbox.selectByVisibleText("October");
		Thread.sleep(3000);
		System.out.println("After Selection the value is :"+dropbox.getFirstSelectedOption().getText());
		
		
		List<WebElement>olists=dropbox.getOptions();
		System.out.println(olists.size());
		for(WebElement e1:olists){
			
			System.out.println(e1.getText());
			
		}
		
		
		
	}

}
