package bootstrapDD;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDD {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.id("menu1")).click();
		List<WebElement> olists=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		System.out.println(olists);
//		for(WebElement ele:olists){
//			
//			if(ele.getText().contentEquals("JavaScript"))
//				ele.click();
//			
//		}
		
		for(int i=0;i<olists.size();i++){
			
			if(olists.get(i).getAttribute("innerHTML").contentEquals("JavaScript")){
				
				olists.get(i).click();
				break;
			}
			
		}
	}

}
