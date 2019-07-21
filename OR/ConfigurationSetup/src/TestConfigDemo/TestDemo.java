package TestConfigDemo;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {

	
	@Test
	public  void TestConfig() throws Exception {
		
		File src=new File("./Configuration/Config.property");
		FileInputStream ofile=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(ofile);
		String chromepath=pro.getProperty("ChromeDriver");
		System.out.println("Hey Chrome path...."+chromepath);
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		String Urls=pro.getProperty("Url");
		driver.get(Urls);
		System.out.println(driver.getTitle());
		
	    driver.quit();

	}

}
