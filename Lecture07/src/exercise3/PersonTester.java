package exercise3;

import java.util.ArrayList;

public class PersonTester {

	public static void main(String[] args) {
		// Create array list
		ArrayList<Person> friendList = new ArrayList<Person>();
		
		// Create three objects
		Person a = new Person("Siripen");
		Student b = new Student("Lisa", 123, 10);
		Instructor c = new Instructor("Phil", 222, 30000);
		
		// Add each object into the list
		friendList.add(a); friendList.add(b); friendList.add(c);
		
		// print information of each person in the friendList
		for(Person p: friendList) {
			System.out.println(p);
			System.out.println("---");
		}
	}

}
