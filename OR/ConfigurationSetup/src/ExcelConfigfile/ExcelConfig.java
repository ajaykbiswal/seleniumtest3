package ExcelConfigfile;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	XSSFWorkbook wb;
	XSSFSheet osheet;
	public ExcelConfig(String Excelfilepath){
		
		
		try 
		{
			File srcc=new File(Excelfilepath);
			
			FileInputStream ofiles=new FileInputStream(srcc);
			
			 wb=new XSSFWorkbook(ofiles);
			
			
		} 
		catch (IOException e) 
		{
			System.out.println("Exception is..."+e.getMessage());
			
		}
		
	}
	
	public String getData(int sheetno,int rowno,int colno)
	{
		
		 osheet=wb.getSheetAt(sheetno);
		 String data=osheet.getRow(rowno).getCell(colno).getStringCellValue();
		 return data;
		
	}
	
	public int getRowcount(int sheetindex){
		
		int rows=wb.getSheetAt(sheetindex).getLastRowNum();
		rows=rows+1;
		return rows;
				
	}
	
}
