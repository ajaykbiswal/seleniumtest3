package inheritence;

public class Childclass2 extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass obj=new BaseClass();
		
		obj.sum();
		obj.sub();
		
		
	}

	public void mul (){
		
		System.out.println("Mult value :2502");
	}

	public void div (){
		
		System.out.println("Division value :205");
	}
	
	
}