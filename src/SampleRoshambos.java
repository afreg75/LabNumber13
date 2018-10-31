
public class SampleRoshambos {

	public static void main(String[] args) {
		Roshambo rock = Roshambo.ROCK;
		Roshambo paper = Roshambo.PAPER;
		Roshambo scissors = Roshambo.SCISSORS;
		
		Player pedro = new Pedro();
		Player roberto = new Roberto();
		
		System.out.println("Rock beats scissors?");
		System.out.println(
							rock.beats(scissors)
						);
		
		
		System.out.println("Pedro beats scissors?");
		System.out.println(
							pedro.generateRoshambo().beats(scissors)
						);
		
		System.out.println("Roberto beats scissors?");
		Roshambo test = roberto.generateRoshambo();
		System.out.println(
				test.beats(scissors)
					);
		
		System.out.println("Is Pedro Always Rock?");
		System.out.println(pedro.generateRoshambo() == rock);
		
				
		System.out.println("Roberto is a " + test);
		
	}

}
