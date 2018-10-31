import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userOpponent;
		Player one = new Roberto();
		Player two = new Pedro();
		Player three = new RealPlayer(scnr);
		
		System.out.println("Please enter your name:");
		String userName = scnr.next();
		
		System.out.println ("Would you like to play agains, Player one Player two?");
		String userSelection = scnr.next();
		
		System.out.println();
		
		String userResponse;
		do {
			
			Roshambo oneChoice = one.generateRoshambo();
			Roshambo twoChoice = two.generateRoshambo();
			Roshambo threeChoice = three.generateRoshambo();
			
			if (oneChoice.beats(twoChoice)) {
				System.out.println(one.getName() + " wins.");
			} else if (oneChoice.ties(twoChoice)) {
				System.out.println("It's a tie.");
			} else {
				System.out.println(two.getName() + " wins.");
			}
				System.out.println("Would you like to play again?");
				userResponse = scnr.next();
				
			}while (userResponse.equalsIgnoreCase("yes"));{
				
				System.out.println("Thank you for playing!" );

		scnr.close();
			}
}
		
	public static void playGame(String userName, Player player) {
		System.out.println(userName + " has challenged " + player);
	}

	}
