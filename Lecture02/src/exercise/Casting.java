package exercise;

//Author: Siripen

public class Casting {
	public static void main(String[] args) {
		double balance = 13.75;
		int dollars = (int) balance;
		int amountX = (int) balance * 100; 
		int amountY = (int) (balance * 100);   
		
		System.out.println(balance);
		System.out.println(dollars);
		System.out.println(amountX);
		System.out.println(amountY);
				
	}
}
