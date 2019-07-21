package dropdownDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class DropDown1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath(".//*[@id='month']"));
	    Select d=new Select(ele);
	    List<WebElement> elements=d.getOptions();
	    
	    System.out.println(elements.size());
	    
	    for(WebElement e1:elements){
	    	 System.out.println(e1.getText());
	    	
	    }
	   
	    		
	    	
		
		
		

	}

}
