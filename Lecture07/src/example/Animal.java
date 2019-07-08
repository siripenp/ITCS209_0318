package example;

public class Animal {
	public void print() {
		System.out.println("Superclass animal.");
	}
}

class Dog extends Animal{
	private String name;
	
	public Dog(String name) {
		super();
		this.name = name;
	}
	public void print() {
		System.out.println("Subclass dog.");
	}
	public String toString() {
		return "Dog name is " + this.name;
	}
}
