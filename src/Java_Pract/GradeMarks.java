package Java_Pract;

public class GradeMarks {

	public static void main(String[] args) {
		
		
		double i=45;
		 
		if(i<0 || i>100) {
			System.out.println("invalid");
		}
		else if (i<25) {
			System.out.println("F");
		}
		else if (i<45) {
			System.out.println("E");
		}
		else if (i<50) {
			System.out.println("D");
		}
		else if (i<60) {
			System.out.println("C");
		}
		else if (i<80) {
			System.out.println("B");
		}
		else{
			System.out.println("A");
		}
		
		// second method
//		if(i<0 || i>100) {
//			System.out.println("invalid");
//		}
//		else if (i>0 && i<25) {
//			System.out.println("F Grade");
//		}
//		else if (i>25 && i<45) {
//			System.out.println("E Grade");
//		}
//		else if (i>45 && i<50) {
//			System.out.println("D Grade");
//		}
//		else if (i>50 && i<60) {
//			System.out.println("C Grade");
//		}
//		else if (i>60 && i<80) {
//			System.out.println("B Grade");
//		}
//		else{
//			System.out.println("A Grade");
//		}



	}

}

