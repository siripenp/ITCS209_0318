package exercise;

//Author: Siripen

public class AdvOperation {

	public static void main(String[] args) {
		int a = 2, b = 7, c = 6;
		double result = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.println(result);
		
		int n = 0; 
		System.out.println(n++); 	// 0
		System.out.println(n); 

		
		int m = 0; 
		System.out.println(++m); 	// 1
		System.out.println(m); 	// 1


	}
}
