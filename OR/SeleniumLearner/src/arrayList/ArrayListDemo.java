package arrayList;


import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		
      ArrayList<String> obj=new ArrayList<String>();
      obj.add("Ajay");
      obj.add("Biswal");
      obj.add("Selenium");
      obj.add("QTP");
      
//      for(String obj1:obj)
//      {
//    	  
//    	  System.out.println(obj1);
//      }
//    
//      for(int i=0;i<obj.size();i++){
//    	  
//    	  System.out.println(obj.get(i));
//    	  
//      }
      
      Iterator <String> it=obj.iterator();
      
      while(it.hasNext()){
    	  
    	  String val=it.next();
    	  
    	  System.out.println(val);
      }
      
	}

}
