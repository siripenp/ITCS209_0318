package lab;

import java.util.Scanner;

public class AdvNumberSet {
	public static void main(String[] args) {
		int max = -1, min = 1000, sum = 0;
		double num = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter a number between 0 to 100. To exit enter -1");
			int x = scan.nextInt();
			if(x >= 0 && x <= 100) {
				if(x > max) {
					max = x;
				} 
				if(x < min) {
					min = x;
				}
				num++;
				sum = sum + x;
			} else if(x == -1) {
				break;
			}
			else {
				System.out.println("Invalid number!");
			}
			
		}
		System.out.println("The maximum number is " + max);
		System.out.println("The minimum number is " + min);
		
		System.out.println("The average value is " + sum/num);
	}
}
