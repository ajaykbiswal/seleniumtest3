package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestData1 {

	public static void main(String[] args) throws Exception {
		
		String filepath=System.getProperty("user.dir");
		FileInputStream file=new FileInputStream(new File(filepath+"\\ExcelData\\TestData.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet osheet=wb.getSheetAt(1);
		for(int i=0;i<osheet.getLastRowNum()+1;i++){
			
			int irow=(int)osheet.getRow(i).getCell(0).getNumericCellValue();
			
			System.out.println(irow);
//			System.out.println(osheet.getRow(i).getCell(1).getStringCellValue());
			
		}
				
//		FileOutputStream ofiles=new FileOutputStream(src);
//		osheet.getRow(4).createCell(9).setCellValue("yuiwow");
//		wb.write(ofiles);
//		wb.close();
//		

	}

}
