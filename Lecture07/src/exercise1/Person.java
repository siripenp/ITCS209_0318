package exercise1;

public class Person {
	private String fullname;
	
	public Person(String name) {
		this.fullname = name;
	}
	
	public void printInfo() {
		System.out.println("Name: " + this.fullname);
	}
	
	public String getFullname() {
		return this.fullname;
	}
}
