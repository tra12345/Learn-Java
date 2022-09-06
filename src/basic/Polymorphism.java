package basic;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 myAnimal = new Animal2(); // Create a Animal object
		Animal2 myPig = new Pig2(); // Create a Pig object
		Animal2 myDog = new Dog(); // Create a Dog object
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}

}

class Animal2 {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig2 extends Animal2 {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal2 {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}
