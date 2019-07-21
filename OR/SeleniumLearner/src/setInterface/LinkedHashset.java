package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashset {

	public static void main(String[] args) {
		
//		LinkedHashSet<String> obj=new LinkedHashSet<>();
		TreeSet<String> obj=new TreeSet<>();
		obj.add("Selenium");
		obj.add("Ajay");
	    obj.add("Biswal");
	    obj.add("3");
	    obj.add("Selenium");
	    obj.add("QTP");
	    obj.add("38");
	    
	    for(String e:obj){
	    	System.out.println(e);
	    }

	}

}
