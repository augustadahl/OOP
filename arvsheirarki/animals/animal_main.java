package animals;

import java.util.ArrayList;

public class animal_main {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<Animal>();

		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal ost = new Ostrich();
		Animal sea = new Seagull();

		animals.add(dog);
		animals.add(cat);
		animals.add(ost);
		animals.add(sea);

		for (Animal animal : animals) {
			//animal.makeSound();
			if(animal instanceof Flyable) {
				((Flyable) animal).fly();
			}
		}

	}

}
