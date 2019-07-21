package pageScrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath(".//*[@id='mCSB_4_container']/p[4]"));
		
//		je.executeScript("arguments[0].scrollIntoView(true);", element);
		je.executeScript("scroll(0,400)");             
		System.out.println(element.getText());
	}

}
