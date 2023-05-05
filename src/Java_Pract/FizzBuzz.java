package Java_Pract;

public class FizzBuzz {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n=25;
		String[] result=fizzBuzz(n);
		System.out.println(result);
		for(int i=0;i<n;i++) {
			System.out.println(result[i]);
		}
		

	}
	public static String [] fizzBuzz(int n)
	{
          String [] fb=new String [n] ;
          int count=1;
          for(int i=0;i<n;i++){
        	  

               if(count%3==0 && count%5==0){
                    fb[i]="FizzBuzz ";
                    count++;
               }else if(count%3==0){
                    fb[i]="Fizz";
                    count++;
               }  else if(count%5==0){
                    fb[i]="Buzz";
                    count++;
               }else{
                 fb[i]=Integer.toString(count); 
                 count++;
               }
               
          }
          return fb;

	}

}
