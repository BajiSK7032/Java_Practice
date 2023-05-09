package Java_Pract;

import java.util.ArrayList;
import java.util.List;

public class DimodStar_Printing {

	
	    public static void main(String[] args) {
	    	int n=15;
	    	
	    	//Drimod_print (n);
	    	
	    	
	    	String[] pattern = diamondPrinting(n);

	        for (int i = 0; i < 2 * n - 1; i++) {
	             System.out.println(pattern[i]);
	             
	        }
	    }
	    
	    
	    
	
	   public  static String[] diamondPrinting(int n) {
	        List<String> ans=new ArrayList<String>();
	        for(int i=1;i<=2*n-1;i++ ){
	        	
	            String line="";
	            
	           
	            if(i<=n){
	            	 for (int j = n - i; j >= 1; j--) {
	 	                line+=" ";
	 	            }
	               for(int j=1;j<=i;j++){
	                    line+="* ";//* , * *,* * * ,* * * * ,* * * * *,

	                } 
	            

	            }else {
	            	for (int j = i-n; j >= 1; j--) {
 	                line+=" ";
 	             }
	            	
	                for(int j=1;j<=2*n-i;j++){
	                line+="* ";
	            }
	               
	                
	        }
	        ans.add(line);


	    }
	   return ans.toArray(new String[ans.size()]);

	    }
	   
	    public static void Drimod_print (int n) {
	    	 // Change this value to adjust the number of n
	        
	        for (int i = 1; i <= n; i++) {
	        	
	            // Print spaces before the stars
	            for (int j = n - i; j >= 1; j--) {
	                System.out.print(" ");
	            }
	            
	            // Print the stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            
	            System.out.println(); // Move to the next line
	        }
	        
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces before the stars
	            for (int j = n - i; j >= 1; j--) {
	                System.out.print(" ");
	            }
	            
	            // Print the stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            
	            System.out.println(); // Move to the next line
	        }
	    }

}
