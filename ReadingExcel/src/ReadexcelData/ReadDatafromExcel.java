package ReadexcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {

	public static void main(String[] args) throws Exception {
		File src=new File("D:\\ExcelData\\TestData.xlsx");
		FileInputStream files=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(files);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data form Excel is "+ data0);
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data form Excel is "+ data1);
		wb.close();
			
		

	}

}