package setInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		
		Set<String> obj=new HashSet<>();
		obj.add("Selenium");
		obj.add("Ajay");
	    obj.add("Biswal");
	    obj.add("3");
	    obj.add("Selenium");
	    obj.add("QTP");
	    obj.add("38");
	    
	    System.out.println(obj);
	    ArrayList<String> olist=new ArrayList<>(obj);
	    
	    System.out.println(olist.get(4));
//	    for(String e:olist){
//	    	System.out.println(e.get);
//	    }

	}

}
