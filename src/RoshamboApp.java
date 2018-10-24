import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String name = null;
		String opponent;
		String tryAgain;
		Roshambo value;
		
		String playerName = Validator.getString(scnr, "Enter name");
		
		
//		System.out.println("Would you like to play a game? Select " );
//		System.out.println();
		
		System.out.println("Please select Rock, Paper or Scissors");
		String userSelection = scnr.next();
				
		System.out.println("You have selected " + userSelection);
		
		

	}

}
