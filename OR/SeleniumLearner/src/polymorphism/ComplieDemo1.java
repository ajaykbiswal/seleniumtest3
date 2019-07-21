package polymorphism;

public class ComplieDemo1 {

	public static void main(String[] args) 
	{
		ComplieDemo1 obj=new ComplieDemo1();
		obj.add(10, 78);
		obj.add(10, 10, 10);
		obj.add(56, 10);
		obj.add(32, 10);
		obj.add(83, 19);

	}

	
	
	public void add(int a,int b)//
	{
		
		int c=a+b;
		System.out.println("Addintion value "+c);
	}
	
	public void add(int a,int b,int d)//Number of Argumnets
	{
		
		int c=a+b+d;
		System.out.println("Addintion value "+c);
	}
	
	public void add(int a,double b)//Order of Argumnets

	{
		double c=a+b;
		System.out.println("Addintion value "+c);
	}
	
	public void add(double a,double b)//Order of Argumnets

	{
		double c=a+b;
		System.out.println("Addintion value "+c);
		
	}
	
	public void add(double a,int b)//Order of Argumnets

	{
		double c=a+b;
		System.out.println("Addintion value "+c);
		
	}
}
