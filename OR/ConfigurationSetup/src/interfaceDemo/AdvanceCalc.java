package interfaceDemo;

public class AdvanceCalc implements Calc {

	public static void main(String[] args) {
		
		Calc obj1=new AdvanceCalc();
		obj1.add();
		obj1.sub();
        

	}


	 public void Sin()
	 {
			
			System.out.println("Sin Value is: 34");
		}
	   
	   public void oct()
	   {
			
			System.out.println("oct Value is: 24");
		}

	
	public void add() 
	
	{
		
		System.out.println("Addition Value is: 250");
	}

	public void sub() 
	
	{
		
		System.out.println("Addition Value is: 150");
	}

	
  
   
}
