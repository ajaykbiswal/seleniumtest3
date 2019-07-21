package TestConfig;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;


public class TestConfigFile {

	Properties pros;
	
	public TestConfigFile()
	{
		
		try 
		{
			File sd=new File("./Configuration/Config.property");
			
			FileInputStream oFl=new FileInputStream(sd);
			
			pros=new Properties();
			
			pros.load(oFl);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is......"+e.getMessage());
			
		}
					
	}		
	
	
	public String getChromePath()
	{
		
		return pros.getProperty("ChromeDriver");
		
	
		
		
	}
	
	
	public String getApplicationUrl()
	{
		
		return pros.getProperty("Url");
		
	
		
		
	}
	
	public String getExcelPath()
	{
		
		return pros.getProperty("excelfilepath");
		
		
		
		
	}
	

	
}
