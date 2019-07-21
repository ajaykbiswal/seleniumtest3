package ReadexcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel1 {

	public static void main(String[] args) throws Exception {
		
		
		File src=new File("D:\\ExcelData\\TestData.xlsx");
		FileInputStream files=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(files);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int Rowcount=sheet1.getLastRowNum();
		System.out.println("No of Rows is "+(Rowcount+1));
		for(int i=0;i<Rowcount;i++){
			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Excel Row value is "+ data);
		}
			
		
		
		wb.close();
		
		
		
		
	}

}
