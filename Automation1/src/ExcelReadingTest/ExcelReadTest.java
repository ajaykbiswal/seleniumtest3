package ExcelReadingTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadTest {
	XSSFWorkbook wb;
	XSSFSheet osheet;
	public ExcelReadTest(String filepath)
	{
		try 
		{
			File src=new File(filepath);
			FileInputStream ofile=new FileInputStream(src);
			wb=new XSSFWorkbook(ofile);
			
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
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
		return rows;
	}	

	
	
}		
