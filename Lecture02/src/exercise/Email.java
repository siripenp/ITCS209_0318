package exercise;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		// Create String email from the full name
		
		System.out.println("Please enter your firstname lastname: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		
		System.out.println("Please enter your role: ");
		String role = in.nextLine();
		
		// Your code goes here
		int idx = name.indexOf(" ");
		String l = name.substring(idx+1).toLowerCase();
		String f = name.substring(idx - 3, idx);

		if (role.equalsIgnoreCase("yes")) {
			String email = l + "." + f + "@student.mu.ac.th";
			System.out.println(email);
		} else {
			String email = l + "." + f + "@mu.ac.th";
			System.out.println(email);
		}
	}
}
