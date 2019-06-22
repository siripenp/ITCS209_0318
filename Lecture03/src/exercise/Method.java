package exercise;

public class Method {
	// 2.1 create class variable (can be accessed by any method in this class)
	public static double vat = 7.0;
	
	public static void main(String[] args) {
		double price = 10.50;
		int quantity = 2;
		int stock = 20;
		
		// 0. without method
		double totalSale = price * quantity;
		System.out.println("Total sale: " + totalSale );
		
		// 1.2 call method
		calTotalSale(price, quantity);
		
		// 2.3 call method
		calTotalWithVat(price, quantity);
		
		// 3.2 call method
		sold(quantity, stock);
		System.out.println("Current Stock (main): " + stock);
		
		// 4.2 call method
		stock = updateStock(quantity, stock);
		System.out.println("Updated Stock (main): " + stock);
		
	}
	
	// 1.1 create method that requires parameters but no return
	public static void calTotalSale(double p, int q) {
		double sale = p * q;
		System.out.println("Total sale (method): " + sale);
	}
	
	// 2.2 create method that requires parameters but no return
	public static void calTotalWithVat(double p, int q) {
		double saleWithTax = (p * q) + ((p * q) * vat / 100);
		System.out.println("Total sale with tax: " + saleWithTax);
	}
	
	// 3.1 pass by value!!!
	public static void sold(int q, int stock) {
		stock = stock - q;
		System.out.println("Updated Stock (local): " + stock);
	}
	
	// 4.1 return updated value
	public static int updateStock(int q, int stock) {
		stock = stock - q;
		System.out.println("Updated Stock (local): " + stock);
		return stock;
	}
	
}
