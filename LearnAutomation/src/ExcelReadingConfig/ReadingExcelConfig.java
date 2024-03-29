package ExcelReadingConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelConfig {
	
	XSSFWorkbook wb;
	
	XSSFSheet osheet;
	
	public ReadingExcelConfig(String filepath)
    {
		try 
		{
			File src=new File(filepath);
			FileInputStream ofile=new FileInputStream(src);
			wb=new XSSFWorkbook(ofile);
		    
		} 
		catch (Exception e) 
		 {
			 System.out.println(e.getMessage());
		 }
		
	}
	
 public String getData(int sheetNo,int rowno,int colno){
	 osheet=wb.getSheetAt(sheetNo);
	 String data=osheet.getRow(rowno).getCell(colno).getStringCellValue();
	 return data;
	 
 }
	
 public int getrowcount(int sheetIndex){
	 int rows=wb.getSheetAt(sheetIndex).getLastRowNum();
	 return rows;
 }
 
 
}
