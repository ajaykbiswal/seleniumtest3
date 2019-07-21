package ExcelLibs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfigs {
	XSSFWorkbook wb;
	XSSFSheet Osheet;
	public ExcelDataConfigs(String filepath){
		
		try {
			File src=new File(filepath);
			FileInputStream files=new FileInputStream(src);
			wb=new XSSFWorkbook(files);
		
		} 
		 catch (Exception e) 
		 {
			System.out.println(e.getMessage());
		 }
			
	}

	public String getData(int sheetno,int rowno,int colno)
	{
		Osheet=wb.getSheetAt(sheetno);
		String data=Osheet.getRow(rowno).getCell(colno).getStringCellValue();
		return data;
	}
	
	public int getRowcount(int sheetIndex)
	{
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
}
