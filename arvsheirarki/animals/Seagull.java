package animals;

public class Seagull extends Bird implements Flyable{

	public Seagull() {
		super("WREEE");

	}

	@Override
	public void fly() {
		System.out.println("Seagull is flying");
	}

}
