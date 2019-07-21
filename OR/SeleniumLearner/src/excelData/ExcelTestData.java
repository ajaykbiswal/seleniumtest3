package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestData {

	public static void main(String[] args) throws Exception {
		
		String filepath="D:\\ExcelData\\TestData.xlsx";
		File src=new File(filepath);
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet osheet=wb.getSheetAt(0);
		for(int i=0;i<osheet.getLastRowNum()+1;i++){
			
			System.out.println(osheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println(osheet.getRow(i).getCell(1).getStringCellValue());
			
		}
				
		FileOutputStream ofiles=new FileOutputStream(src);
		osheet.getRow(4).createCell(9).setCellValue("yuiwow");
		wb.write(ofiles);
		wb.close();
		

	}

}
