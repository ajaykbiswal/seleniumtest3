package inheritence;

public class Childclass extends BaseClass {

	public static void main(String[] args) {
		
		Childclass obj=new Childclass();
		
		obj.sum();
		obj.sub();
		obj.mul();
		obj.div();
	}

	public void mul (){
		
		System.out.println("Mult value :2502");
	}

	public void div (){
		
		System.out.println("Division value :205");
	}
	
	
}
