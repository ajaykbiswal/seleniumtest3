package TestDemo;

public class ConfigDemo1 {

	public static void main(String[] args) {
		
		Excelcalling con=new Excelcalling("D:\\SeleniumTest\\OR\\ConfigurationSetup\\TestData\\Exceldata.xlsx");
		int rows=con.getrowcount(0);
		
		for (int i=0;i<rows;i++){
			System.out.println(con.getdata(0, i, 0));
			System.out.println(con.getdata(0, i, 1));
			
		
			
			
		}
		
		
	}

}
