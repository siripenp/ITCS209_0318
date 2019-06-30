package example;

public class BankTester {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(1234);
		System.out.println("My current balance: " + 
							myAccount.getBalance());
		
		// to withdraw money from my account
		
		// Option (a) 
		// myAccount.balance = 0 - 5000;	// Error!
		
		// Option (b)
		myAccount.withdraw(5000);
		
		System.out.println("My updated balance: " + 
							myAccount.getBalance());
	}
}
