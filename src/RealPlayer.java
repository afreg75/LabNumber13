import java.util.Scanner;

public class RealPlayer extends Player {
	private static Scanner scnr;
	
	public RealPlayer(String name) {
		super(name);
//		this.name = name;
		
	}

	public RealPlayer(Scanner scnr) {
		this(scnr, "RealPlayer");
	}
	
	public RealPlayer(Scanner scnr, String name) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		
	
		
		System.out.println("What would you like to play Rock, Paper, or Scissors?");
		
		String choice;
		do {  
			
			choice = scnr.next();
			
			if (choice.toLowerCase().equals("rock")) {
				return Roshambo.ROCK;
			}
			if (choice.toLowerCase().equals("paper")) {
				return Roshambo.PAPER;
			}
			if (choice.toLowerCase().equals("scissors")) {
				return Roshambo.SCISSORS;
			}
			else 
				System.out.println("Please enter Rock, Paper or Scissors");
				
			}while (choice != "rock" || choice != "paper" || choice != "scissors");
				return null;
		
		}
	}
	
