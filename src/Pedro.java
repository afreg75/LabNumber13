public class Pedro extends Player {

	public Pedro() {
		super("Pedro");
	}

	public Pedro(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}