package exercise;

public class Item {
	public static void main(String[] args) {
		double[] price = {10.5, 20, 30, 40, 50};
		int[] quantity = {1, 2, 3, 4, 5};
		
		// Passing array in the method
		double totalSale = calTotalSale(price, quantity);
		System.out.println("The total sale is " + totalSale);
		
		// Getting average price
		double avg = getAveragePrice(price);
		System.out.println("Average price is " + avg);
		
		// Growing price array
		double[] temp = new double[price.length*2];
		System.arraycopy(price, 0, temp, 0, price.length);
		price = temp;
		for(double p: price) {
			System.out.print(p + ", ");
		}
	}
	
	public static double calTotalSale(double[] p, int[] q) {
		double total = 0;
		for(int i = 0; i < p.length; i++) {
			total = total + p[i]*q[i];
		}
		return total;
	}
	
	public static double getAveragePrice(double[] p) {
		double sum = 0;
		for(double x: p) {
			sum += x;
		}
		return sum/p.length;
	}
}
