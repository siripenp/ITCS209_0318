package exercise1;

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
		friendList.add(a);
		friendList.add(b);
		friendList.add(c);
		
		// Q1: How to print fullname of each person in the friendList
		// YOUR CODE GOES HERE
		
		// Q2: How to print fullname and student id of a Student in the list
		// YOUR CODE GOES HERE

	}

}
