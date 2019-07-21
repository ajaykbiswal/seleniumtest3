package ExcelTest;

public class CallingExcelFile {

	public static void main(String[] args) {
		ExcelConfig excel=new ExcelConfig("D:\\ExcelData\\TestData.xlsx");
		int rows=excel.TotalRows(0);
		System.out.println("Total No.of Rows: "+(rows+1));
		for(int i=0;i<rows;i++)
		{
			System.out.println(excel.getdata(0, i, 0));
			System.out.println(excel.getdata(0, i, 1));
				
		}
		

	}

}
