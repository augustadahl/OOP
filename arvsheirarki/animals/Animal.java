package animals;

public abstract class Animal {

	private String sound;

	public Animal(String sound) {
		this.sound = sound;
	}

	public void makeSound() {
		System.out.println(sound);
	}

}
