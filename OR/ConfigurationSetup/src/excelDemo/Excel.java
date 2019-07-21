package excelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws Exception {
		
		
		String filepath="D:\\ExcelData\\TestData1.xlsx";
	    File src=new File(filepath);
	    FileInputStream ofile=new FileInputStream(src);
	    XSSFWorkbook wb=new XSSFWorkbook(ofile);
	    XSSFSheet osheet=wb.getSheetAt(1);
	    System.out.println(osheet.getLastRowNum());
	    
	    for(int i=0;i<osheet.getLastRowNum()+1;i++){
	    	
	    	String rowval=osheet.getRow(i).getCell(0).getStringCellValue();
	    	String colval=osheet.getRow(i).getCell(1).getStringCellValue();
	    	
	    	System.out.println("Row value :"+rowval);
	    	System.out.println("Column value :"+colval);
	    }
	    
	    
	    osheet.getRow(1).createCell(8).setCellValue("weryee");
	    FileOutputStream ofiles=new FileOutputStream(new File("D:\\ExcelData\\TestData1.xlsx"));
	    wb.write(ofiles);
	    wb.close();
	    
	    
	    
	    
	    
	    

	}

}
