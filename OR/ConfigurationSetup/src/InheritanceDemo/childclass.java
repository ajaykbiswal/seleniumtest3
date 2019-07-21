package InheritanceDemo;

public class childclass extends BaseClass{

	public static void main(String[] args) {
		
		
		BaseClass obj=new BaseClass();
        obj.add();
        obj.sub();
	}

	public void mul()
	{
		
		System.out.println("Multiplication Value is: 350");
	}
	
	
	public void div()
	{
		
		System.out.println("Division Value is: 50");
	}
}


