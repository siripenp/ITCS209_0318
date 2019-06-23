package example;

import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// to get size of the array list
		System.out.println("Size of numbers is " + numbers.size());
		// to add a new element to the array list
		numbers.add(10);
		System.out.println("Size of numbers is " + numbers.size());
		numbers.add(20);
		System.out.println("Size of numbers is " + numbers.size());
		
		// to retrieve element in the array list
		System.out.println("Value at index 0 = " + numbers.get(0));
		System.out.println("Value at index 1 = " + numbers.get(1));
		//System.out.println("Value at index 2 = " + numbers.get(2));	// Error!!
		
		// to update an element at a particular index
		numbers.set(1, 15);
		System.out.println("Updated value at index 1 = " + numbers.get(1));
		
		// to add an element at the end of the array list
		numbers.add(25);
		System.out.println("New element " + numbers.get(numbers.size()-1));
		
		// to insert an element at a particular index
		numbers.add(1, 20);
		System.out.println("Value at index 1 = " + numbers.get(1));
		System.out.println("Value at index 2 = " + numbers.get(2));
		
		// to remove an element from the array list
		numbers.remove(1);
		System.out.println("Value at index 1 = " + numbers.get(1));
		System.out.println("Value at index 2 = " + numbers.get(2));
		
	}
}
