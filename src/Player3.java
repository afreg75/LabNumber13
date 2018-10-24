import java.util.Scanner;

public class Player3 extends Player {
	private static Scanner scnr;
	
	
	@Override
	public Roshambo generateRashambo() {
		scnr = new Scanner(System.in);
		String userInput = Validator.getString(scnr, "Rock, Paper, or Scissors? ");

		switch (userInput) {
		case "ROCK":
			return Roshambo.ROCK;

		case "PAPER":
			return Roshambo.PAPER;

		case "SCISSOR":
			return Roshambo.SCISSOR;

		default:
			return null;
		}
	}
}
