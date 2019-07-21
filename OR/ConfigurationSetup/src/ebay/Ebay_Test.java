package ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Ebay_Test {
	
	WebDriver driver;
	@Test
	public void Ebay_Test_Script(){
		
		 driver=Browser_Factory.startBrowser("chrome", "http://www.ebay.in/");
		 Ebay_Page_Locators ploactor= PageFactory.initElements(driver, Ebay_Page_Locators.class);
		 ploactor.shopCat_Click();
		 ploactor.shopCat_links();
		
		 ploactor.formats();
		 ploactor.capacitys();
		 ploactor.brands();
	}

  
	
	
	
	
}
