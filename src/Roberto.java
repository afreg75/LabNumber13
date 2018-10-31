import java.util.Random;

public class Roberto extends Player {

	public Roberto() {
		super("Roberto");
	}

	public Roberto(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {

		int randNum = (int) (Math.random() * 3);

		switch (randNum) {
		case 0:
			return Roshambo.ROCK;

		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.SCISSORS;
		default:
			return null;
		}
	}

}
