package TestDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcalling {
	
	XSSFWorkbook wb;
	XSSFSheet osheet;
	
	
	public Excelcalling (String filepath)
	
	{
		try 
		{
			File src=new File(filepath);
			FileInputStream ofls=new FileInputStream(src);
			wb=new XSSFWorkbook(ofls);
			 
		} 
		 catch (Exception e) {
			System.out.println("Exception is..."+e.getMessage());
		
		}
		 	
		
	}
	
	
	public String getdata(int sheetno,int rowno,int colno)
	{
		
		osheet=wb.getSheetAt(sheetno);
		String data=osheet.getRow(rowno).getCell(colno).getStringCellValue();
		return data;
		
		
	}

	public int getrowcount(int sheetindex)
	
	{
		int rows=wb.getSheetAt(sheetindex).getLastRowNum();
		rows=rows+1;
		return rows;
		
	}
	
	
}
