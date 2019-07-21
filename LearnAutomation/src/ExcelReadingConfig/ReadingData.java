package ExcelReadingConfig;

public class ReadingData {

	public static void main(String[] args) {
		ReadingExcelConfig excel=new ReadingExcelConfig("D:\\ExcelData\\TestData.xlsx");
		System.out.println(excel.getData(1, 0, 1));
       
	}

}
