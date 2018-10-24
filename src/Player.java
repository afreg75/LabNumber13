
public abstract class Player {
	
	private String name;
	private Roshambo value;
	
	public Player () {}

	public Roshambo getValue() {
		return value;
	}

	public void setValue(Roshambo value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRashambo();

	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}
}
