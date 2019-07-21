package TestDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDemo {
	
	Properties pro;
	public ConfigDemo(){
		
		try 
		
		{
			File sd=new File("./Configuration/Config.property");
			FileInputStream ofi=new FileInputStream(sd);
			 pro=new Properties();
			pro.load(ofi);
		} catch (Exception e) 
		
		{
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	
	public String getchromepath()
	{
		
		String data= pro.getProperty("ChromeDriver");
		System.out.println(data);
		return data;
		
		
		
		
	}

public String getAppUrl()
{
		
		return pro.getProperty("Url");
		
		
		
}
public String getexcelpath()

{
	
	return pro.getProperty("excelfilepath");
	
	
	
}

	
}
