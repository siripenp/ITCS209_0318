package example2;

public class SavingAccount extends BankAccount {
	private double interestRate; 
	
	public SavingAccount(double interest){   
		super(0);
		interestRate = interest;
	}
	
	public SavingAccount(double interest, double balance) {
		super(balance);
		this.interestRate = interest;
	}
	
	public void addInterest() {
		double interest = this.getBalance() * (interestRate / 100.0);
		deposit(interest);
	}
}
