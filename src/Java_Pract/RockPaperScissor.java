package Java_Pract;

public class RockPaperScissor {

	public static void main(String[] args) {
		/*Tom and Jerry have decided to play the classic Stone-Paper-Scissor game to decide 
		 * who gets to have the cake kept in the fridge. You are given their choices as input. 
		 * In case the first player wins, return "Tom", else if the second player wins, return "Jerry", else return "Share it!".
		   At each turn, either player chooses Stone, Paper or Scissor.

			Based on the rules given below in the format of A beats B, the person who choses A wins the game. 
			If both choose the same option then the result is "Share it!".

			Stone beats Scissor

			Scissor beats Paper

			Paper beats Stone*/
		
		String r="Rock";
		String p="paper";
		String sc="scissor";
		String t = "paper";
		String j = "scissor";
		
		
		if (t==j) {
			System.out.println("Share it!");
			}
		else if (t==r) {
			if(j==p) {
				System.out.println("jerry wins");
			}
			else {
				System.out.println("tom wins");
			}
		}
		else if (t==p) {
			if(j==sc) {
				System.out.println("jerry wins");
			}
			else {
				System.out.println("tom wins");
			}
		}
		else if (t==sc) { 
			if(j==r) {
				System.out.println("jerry wins");
			}
			else {
				System.out.println("tom wins");
			}
		}
		else {
			System.out.println("invalid input");
			
		}
		

	}
		
		
		
		
}


