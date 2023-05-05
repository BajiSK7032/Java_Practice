package Java_Pract;

public class Loops {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		System.out.println("solid Rectangle");
		
				//Outer loop for Rows
				for(int i=1;i<=4;i++) {
					//Inner loop for colums
					for(int j=1;j<=5;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				
		System.out.println("Hallow Rectangle");
				//Outer loop for Rows
				for(int i=1;i<=4;i++) {
					
					//Inner loop for colums
					for(int j=1;j<=5;j++) {
						
						// when i=1 or j=1 or i=n or j=m than only print "*" else print "  "
						if(i==1||j==1||i==4||j==5) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
						
					}
					System.out.println("");
				}
				
				System.out.println("Rightangle triangle");
				//Outer loop for Rows
				for(int i=1;i<=4;i++) {
					//Inner loop for colums
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				
				System.out.println("invert Rightangle triangle");
				//Outer loop for Rows
				for(int i=4;i>=1;i--) {
					//Inner loop for colums
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				

	}

}
