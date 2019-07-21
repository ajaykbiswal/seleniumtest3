package ExcelTestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {

	public static void main(String[] args) throws Exception {
		
	
	String filepath="D:\\ExcelData\\TestData.xlsx";
	File src=new File(filepath);
	FileInputStream ofile=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(ofile);
	XSSFSheet osheet=wb.getSheetAt(0);
	
	for(int i=0;i<osheet.getLastRowNum()+1;i++){
		
	 String rowvalue=osheet.getRow(i).getCell(0).getStringCellValue();
	 String colvalue=osheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Row Value is:" +rowvalue);
		System.out.println("Row Value is:" +colvalue);
	}
		
		osheet.getRow(0).createCell(5).setCellValue("Aajay");
		
		FileOutputStream ofiles=new FileOutputStream(new File("D:\\ExcelData\\TestData.xlsx"));
		wb.write(ofiles);
		wb.close();
	}

}
