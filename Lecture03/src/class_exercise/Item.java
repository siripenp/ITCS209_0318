package class_exercise;

public class Item {
		public static void main(String[] args) {
			double[] price = {10.5, 20, 30, 40, 50};
			int[] quantity = {1, 2, 3, 4, 5};
			double totalSale = calTotalSale(price, quantity);
			System.out.println("The total sale is " + totalSale);
			
			double avg = getAveragePrice(price);
			System.out.println("Average price is " + avg);
		}
		
		public static double getAveragePrice(double[] p) {
			double sum = 0;
			for(double d: p) {
				sum = sum + d;
			}
			return sum/p.length;
		}
		
		public static double calTotalSale(double[] p, int[] q) {
			double total = 0;
			
			for(int i = 0; i < p.length ; i ++) {
				total = total + (p[i] * q[i]);
			}
			
			return total;
		}
}
