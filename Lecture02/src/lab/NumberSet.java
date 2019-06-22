package lab;

import java.util.Scanner;

public class NumberSet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int first = scan.nextInt();
		System.out.println("Please enter a number");
		int second = scan.nextInt();
		System.out.println("Please enter a number");
		int third = scan.nextInt();
		
		int max = 0;
		if(first > second) {
			max = first;
			if(max < third) {
				max = third;
			} 
		} else {
			max = second;
			if(max < third) {
				max = third;
			}
		}
		System.out.println("The maximum number is " + max);
		
		int min = 0;
		if(first < second) {
			min = first;
			if(min > third) {
				min = third;
			} 
		} else {
			min = second;
			if(min > third) {
				max = third;
			}
		}
		System.out.println("The minimum number is " + min);
		
		System.out.println("The average value is " + (first + second + third)/3.0);
		
		
	}
}
