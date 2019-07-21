package ReadexcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel1 {

	public static void main(String[] args) throws Exception 
	{
		
		File src=new File("D:\\ExcelData\\TestData.xlsx");
		FileInputStream ofile=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(ofile);
		XSSFSheet osheet=wb.getSheetAt(0);
		int rows=osheet.getLastRowNum();
		System.out.println("Total No.of Rows: "+(rows+1));
		for(int i=0;i<rows;i++)
		{
		 String data=osheet.getRow(i).getCell(1).getStringCellValue();
		 System.out.println("Excel Row value is: "+data);
		}
		
		wb.close();		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
