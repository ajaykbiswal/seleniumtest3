package SeleniumDemo;

public class parameterclass 

{
	int x=99;
	int y=100;
	
	
	public static String Fullname(String first,String last){
		
		String fullname=first+last;
		return fullname;
	}
	
	public  int sum(){
		
		 int c= x+y;
		 return c;
		
	}
	
	public int sub()
	{
		int d=y-x;
		return d;
		
		
	}
	
	
}
