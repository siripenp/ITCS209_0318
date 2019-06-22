// Author: Siripen

package exercise;

public class Operation {
	public static void main(String[] args) {
		int num = 5, num2 = 20, num3;		
		num2 = num2 - num; 			// num2 = 15, num = 5
		int remainder = num2 % (num - 1); 	// 3
		num3 = remainder / 100;	// 0.05 (wrong!!!)
		num3 = (int) (3.0 / 2);
		double num4 = 3.0/0;
		System.out.println(remainder);
		System.out.println(num4);

	}

}
