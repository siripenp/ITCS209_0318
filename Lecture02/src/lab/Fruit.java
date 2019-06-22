package lab;

import java.util.Scanner;

public class Fruit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Color?");
		String ans = scan.nextLine();
		switch (ans) {
			case "green":
				System.out.println("Size?");
				ans = scan.nextLine();
				switch(ans) {
					case "big":
						System.out.println("This fruit is a \"Watermelon\"");
						break;
					case "medium":
						System.out.println("This fruit is an \"Apple\"");
						break;
					case "small":
						System.out.println("This fruit is a \"Grape\"");
						break;
					default:
						System.out.println("Invalid input");
						break;
				}
				break;
				
			case "yellow":
				System.out.println("Shape?");
				ans = scan.nextLine();
				if(ans.equalsIgnoreCase("round")) {
					System.out.println("Size?");
					ans = scan.nextLine();
					if(ans == "big") {
						System.out.println("This fruit is a \"Grapefruit\"");
					} else if(ans.equalsIgnoreCase("small")) {
						System.out.println("This fruit is a \"Lemon\"");
					} else {
						System.out.println("Invalid input");
					}
				} else if(ans.equalsIgnoreCase("thin")){
					System.out.println("This fruit is a \"Banana\"");
				} else {
					System.out.println("Invalid input");
				}
				break;
				
			case "red":
				System.out.println("Size?");
				ans = scan.nextLine();
				if(ans.equalsIgnoreCase("medium")) {
					System.out.println("This fruit is a \"Apple\"");
				} else if(ans.equalsIgnoreCase("small")) {
					System.out.println("Taste?");
					ans = scan.nextLine();
					if(ans.equalsIgnoreCase("sweet")) {
						System.out.println("This fruit is a \"Cherry\"");
					} else if(ans.equalsIgnoreCase("sour")) {
						System.out.println("This fruit is a \"Grape\"");
					} else {
						System.out.println("Invalid input");
					}
				} else {
					System.out.println("Invalid input");
				}
				break;
			
			default:
				System.out.println("Invalid input");
				break;
			
		}		
	}
}
