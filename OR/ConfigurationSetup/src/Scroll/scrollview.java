package Scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollview {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		 
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
//		WebElement ele=driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[8]"));
		
	     je.executeScript("scroll(0, 400)");
		
//		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		
		Thread.sleep(2000);
		
//		System.out.println(ele.getText());
		
		driver.quit();
		
		
	}

}
