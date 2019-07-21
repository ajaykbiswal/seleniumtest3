package SeleniumDemo;

public class firstclassobject {

	
	public static void main(String[] args) 
	
	{
		parameterclass obj1=new parameterclass();
		
		int z=obj1.sum();
		System.out.println("Value is "+z);
		int v=obj1.sub();
		System.out.println("Value is "+v);
		
		String fullname=parameterclass.Fullname("Ajay", "Kumar");
		System.out.println("Congrats! "+fullname);
		
	}

	
}
