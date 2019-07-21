package ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_Configs {
	
	Properties pro;

	public Test_Configs(String configfilepath)
	{
		try 
		{
			File sds=new File(configfilepath);
			
			FileInputStream ofil=new FileInputStream(sds);
			
			pro=new Properties();
			
			pro.load(ofil);
		
		} 
		
		catch (Exception e) 
		
		{
			
		  System.out.println(e.getMessage());
		}
			
		
	}
	
	
	public String getExcelpath()
	{
		return pro.getProperty("excelfilepath");
		
	}
	
	public String getDriver()
	{
		
		return pro.getProperty("ChromeDriver");
		
	}
	
	public String getUrl()
	{
		
		return pro.getProperty("Url");
		
	}
}
