package example;

public class AnimalTester {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog("Fido");
		System.out.println("--- Printing animal ---");
		animal.print();
		System.out.println("--- Printing dog ---");
		dog.print();
		System.out.println(animal);
		System.out.println(dog);
	}
}
