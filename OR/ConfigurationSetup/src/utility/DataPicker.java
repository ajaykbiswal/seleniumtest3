package utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataPicker 
{

	public static WebElement getElementDynamically(WebDriver driver,int TimeOut,By by)
	{
		
		WebDriverWait Wait=new WebDriverWait(driver,TimeOut);
		
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	
	
 public static List<WebElement> getElementsDynamically(WebDriver driver,int TimeOut,By by)
 	{
		WebDriverWait Wait=new WebDriverWait(driver,TimeOut);
		
		return Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	
	}
	
	
 public static void main(String[] args) {

		
		By checkin=By.xpath(".//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/input");
		
	
		By monthHeader=By.cssSelector(".DayPicker-Caption");
		
		By monthTable=By.cssSelector(".DayPicker-Month");
		
		By dateElement=By.cssSelector(".DayPicker-Day");
		
		By nextMonthbutton=By.cssSelector(".DayPicker-NavButton--next");
		
		String checkinMonth="October 2017";
		
		String checkinDate="22";
				
		String checkoutMonth="November 2017";
		
		String checkoutDate="12";	
		
		//Lunching the Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		
		//click on Depart
		
		WebElement ocheckin=getElementDynamically(driver, 30, checkin);
		ocheckin.click();
		
		chooseDepartDate(monthHeader, monthTable, dateElement, nextMonthbutton,
				checkinMonth, checkinDate, driver);

		chooseReturnDate(monthHeader, monthTable, dateElement, nextMonthbutton,
				checkoutMonth, checkoutDate, driver);


	}


	private static void chooseDepartDate(By monthHeader, By monthTable,
			By dateElement, By nextMonthbutton, String checkinMonth,
			String checkinDate, WebDriver driver) 
	{
		
		
		
		
		first:
		for(int i=0;i<12;i++){
		
		List<WebElement> monthHeaderElement=getElementsDynamically(driver, 30, monthHeader);
		
		String fisrtMonth=monthHeaderElement.get(0).getText();
		
		String secondMonth=monthHeaderElement.get(1).getText();
		
		if(checkinMonth.equalsIgnoreCase(fisrtMonth))
		{
			List<WebElement>monthTableElements=getElementsDynamically(driver, 30, monthTable);
			List<WebElement>dateElements=monthTableElements.get(0).findElements(dateElement);
			
			for(WebElement ele:dateElements)
			{
				
				if(ele.getText().equalsIgnoreCase(checkinDate))
				{
					ele.click();
					break first;		
				}
			}
		}	
				else if(checkinMonth.equalsIgnoreCase(secondMonth))
				{
					
					List<WebElement> monthTableElements=getElementsDynamically(driver, 30, monthTable);
					List<WebElement> dateElements=monthTableElements.get(1).findElements(dateElement);
					
					for(WebElement ele:dateElements)
					{
				    if(ele.getText().equalsIgnoreCase(checkinDate))
					{
						ele.click();
						break first;
					}
			}

		} 	     
				else
				{
					
					WebElement nextMonthElement=getElementDynamically(driver, 30, nextMonthbutton);
					nextMonthElement.click();
					
				}
		}		

}

	
	
	private static void chooseReturnDate(By monthHeader, By monthTable,
			By dateElement, By nextMonthbutton, String checkinMonth,
			String checkinDate, WebDriver driver) 
	{
		
		driver.findElement(By.xpath(".//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[2]/div/input[1]")).click();
		
		first:
		for(int i=0;i<12;i++){
		
		List<WebElement> monthHeaderElement=getElementsDynamically(driver, 30, monthHeader);
		
		String fisrtMonth=monthHeaderElement.get(0).getText();
		
		String secondMonth=monthHeaderElement.get(1).getText();
		
		if(checkinMonth.equalsIgnoreCase(fisrtMonth))
		{
			List<WebElement>monthTableElements=getElementsDynamically(driver, 30, monthTable);
			List<WebElement>dateElements=monthTableElements.get(0).findElements(dateElement);
			
			for(WebElement ele:dateElements)
			{
				
				if(ele.getText().equalsIgnoreCase(checkinDate))
				{
					ele.click();
					break first;		
				}
			}
		}	
				else if(checkinMonth.equalsIgnoreCase(secondMonth))
		{
					
					List<WebElement> monthTableElements=getElementsDynamically(driver, 30, monthTable);
					List<WebElement> dateElements=monthTableElements.get(1).findElements(dateElement);
					
					for(WebElement ele:dateElements)
			{
				    if(ele.getText().equalsIgnoreCase(checkinDate))
					{
						ele.click();
						break first;
					}
			}

		} 	     
				else
				{
					
					WebElement nextMonthElement=getElementDynamically(driver, 30, nextMonthbutton);
					nextMonthElement.click();
					
				}
			

	   }
	
	
	
	
	
	
   }
	
}





