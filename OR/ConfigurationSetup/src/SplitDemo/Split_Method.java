package SplitDemo;

public class Split_Method {

	public static void main(String[] args) {
		
		
		String name="HO-HP-QTP-Selenium";
		String [] data=name.split("-");
		
		for(int i=0;i<data.length;i++)
		
		{
           if (data[i].contains("Selenium"))
           
           {
        	   System.out.println("paased");
        	   break;
        	   
           }
           else
           {
        	   System.out.println("failed");
        	   break;
           }
			
		}
		
				
				

	}

}
