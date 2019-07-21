package inheritence;

public class InherChildclass extends InherBaseclass {

	public static void main(String[] args) {
		
		InherBaseclass obj=new InherBaseclass();
		obj.sum();
		obj.sub();
//	obj.mul();
//		obj.div();

	}

public void mul(){
		
		System.out.println("Multiplication value :750");
	}

	
 public void div(){
		
		System.out.println("Division value :450");
	}
	
	
}
