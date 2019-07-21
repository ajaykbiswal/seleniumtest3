package DataCalendra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

public class redBusCalDatePicker {

	
	public static WebElement getElementDate(WebDriver driver,int TimeOut,By by)
	{
	    WebDriverWait wait= new WebDriverWait(driver, TimeOut);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	
	}
	
	public static List<WebElement> getElementsDate(WebDriver driver,int TimeOut,By by)
	{
	    WebDriverWait wait= new WebDriverWait(driver, TimeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	
	}


	

	public static void main(String[] args) {
		
		By checkin=By.cssSelector("#txtJourneyDate");
		
		By monthLabel=By.cssSelector(".ui-datepicker-title");
		
		By monthTable=By.cssSelector("#ui-datepicker-div");
		
		By dateElement=By.cssSelector(".ui-state-default");
		
		By nextMonthButton=By.cssSelector(".ui-icon.ui-icon-circle-triangle-e");
		
		String checkinMonth="Oct 2017";
		
		String checkinDate="22";
				
		String checkoutMonth="November 2017";
		
		String checkoutDate="12";
		
		
		//launch the Redbus
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		//Click on the Departbutton
		WebElement checkinElement=getElementDate(driver, 30, checkin);
		checkinElement.click();
		
chooseDepartDate(monthLabel, monthTable, dateElement, nextMonthButton,
		checkinMonth, checkinDate, driver);	
	
	}

	private static void chooseDepartDate(By monthLabel, By monthTable,
			By dateElement, By nextMonthButton, String checkinMonth,
			String checkinDate, WebDriver driver) {
		first:		
		for(int i=0; i<12;i++){
			
				WebElement monthLabelElement=getElementDate(driver, 30, monthLabel);
                String firstDate=monthLabelElement.getText();
				if(checkinMonth.equalsIgnoreCase(firstDate)){
					
					WebElement monthTableEle=getElementDate(driver, 30, monthTable);
					List<WebElement> dateElements=monthTableEle.findElements(dateElement);
					
					for(WebElement ele:dateElements){
						
						if(ele.getText().equalsIgnoreCase(checkinDate)){
							
							ele.click();
							break first;
							
						}
						
					}
					
				}	
			
				else 
				{
					WebElement nextmonthElement=getElementDate(driver, 30, nextMonthButton);
					nextmonthElement.click();
			
					
				}
			
				
			}
	}

}
