package ExcelLibs;

public class ReadExcelData {

	public static void main(String[] args) {
		ExcelDataConfigs excel=new ExcelDataConfigs("D:\\ExcelData\\TestData.xlsx");
		System.out.println(excel.getData(1, 0, 1));

	}

}
