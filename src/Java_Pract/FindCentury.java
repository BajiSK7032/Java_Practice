package Java_Pract;

public class FindCentury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1701;
		int cen=100;
		 int result= year/cen;
		 
		
		 if(year>(result*100)) {
			 
			 System.out.println(result+1+"th century");
		 }
		 else {
			System.out.println(result+" th century");
		 }
		 
		 
		 
		

	}

}
