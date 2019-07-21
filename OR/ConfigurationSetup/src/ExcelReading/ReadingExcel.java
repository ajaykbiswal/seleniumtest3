package ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	XSSFWorkbook wb;
	
	XSSFSheet osheet;
	
	public ReadingExcel(String ExcelPath) 
	
	{
		try {
			File src=new File(ExcelPath);
			
			FileInputStream ofile=new FileInputStream(src);
			
			wb=new XSSFWorkbook(ofile);
		
		} catch (Exception e) {
			
			System.out.println("Error Message:"+e.getMessage());
			
		}
			
		
	}
	
 public String getData(int sheetno,int rowno,int colno)
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
