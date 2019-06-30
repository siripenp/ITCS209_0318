package example;

// Ref: Java Concepts, 7th International Edition, by Cay Horstmann 2013

public class BankAccount {
	private int accountNumber;
	private double balance;
	
	/*
	 * Constructs a bank account with a zero balance
	 * @param anAccountNumber the account number for this account
	 */
	public BankAccount(int anAccountNumber)
	{   
		accountNumber = anAccountNumber;
		balance = 0;
	}
	
	/*
	 * Constructs a bank account with a given balance
	 * @param anAccountNumber the account number for this account
	 * @param initialBalance the initial balance
	 */
	public BankAccount(int anAccountNumber, double initialBalance)
	{   
		accountNumber = anAccountNumber;
		balance = initialBalance;
	}
	
	/*
	 * Gets the current balance of the bank account.
	 * @return the current balance
	 */
	public double getBalance()
	{   
		return balance;
	}
	
	/*
	 * Gets the account number of this bank account.
	 * @return the account number
	 */
	public int getAccountNumber()
	{   
		return accountNumber;
	}
	
	/*
	 * Deposits money into the bank account.
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{  
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	/*
	 * Withdraws money from the bank account. 
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{   
		if(amount > balance) {
			System.out.println("Warning: You don't have enough money to withdraw.");
		} else {
			double newBalance = balance - amount;
			balance = newBalance;
		}
	}
	
	
}
