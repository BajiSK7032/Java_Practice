package Java_Pract;

public class Square {

	

			 public static void main(String[] args) {
				 
				 Pattern();
			 }
			 
			 public static void Pattern() {
				 int n=5, count=n;

				
				  for (int a = 1; a < n; a++) {
					  
					 for(int i=count-1;i>1;i--) {
						   
							  System.out.print(" ");
					  }
					 for (int x = 1; x <= a; x++) {
						  System.out.print("* ");
						  
					  }
					  // To print new line.
					  System.out.println();
					  count--;
				  	}
				  
				  
				  
			 }
			 public static void square() {
				 int sum = 0;  
				 for (int i=5;i>=1;i--){      
					 if(i%2!=0){
						 if(sum<(i*i)){
				     sum = (i*i)-sum;
				    }else{
				     sum = sum-(i*i);
				    }    
				   }else{    
				    sum = sum+(i*i);
				   }    
				  }
				  System.out.println(sum);
				 }
					

}


	


