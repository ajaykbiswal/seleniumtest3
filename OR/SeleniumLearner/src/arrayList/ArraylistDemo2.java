package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> obj=new ArrayList<>();
		obj.add("Ajay");
	    obj.add("Biswal");
	    obj.add("Selenium");
	    obj.add("QTP");
//	    Iterator<String> obj1=obj.iterator();
//	    while(obj1.hasNext()){
//	    	
//	    	System.out.println(obj1.next());
//	    }
		for(Object s:obj){
			
			System.out.println(s);
		}
	}

}
