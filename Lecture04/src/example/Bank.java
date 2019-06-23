package example;

//Author: Siripen

import java.util.ArrayList;

public class Bank {
	public static void main(String[] args) {
		BankAccount[] accountsArr = new BankAccount[5];
		for(int i = 0; i < accountsArr.length; i++) {
			accountsArr[i] = new BankAccount(i);
		}
		
		// Declare ArrayList of BankAccount Object
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		// Add new BankAccount in ArrayList
		accounts.add(new BankAccount(1001));
		accounts.add(new BankAccount(1015, 50000));
		
		// Get BankAccount from the ArrayList
		BankAccount a = accounts.get(0);
		System.out.println(a.getAccountNumber() + " has balance " + a.getBalance());
		
		BankAccount b = accounts.get(1);
		System.out.println(b.getAccountNumber() + " has balance " + b.getBalance());
		
		// deposit 2000 into an account a (where a is an accounts at index 0)
		a.deposit(2000);
		
		// Find BankAccount that has balance between 1000 and 4000
		for(BankAccount ba: accounts) {
			if(ba.getBalance() > 1000 && ba.getBalance() < 4000) {
				System.out.println(ba.getAccountNumber() + " has balance " + ba.getBalance());
			}
		}
		
		
		// Find BankAccount
		BankAccount c = findBankAccount(accounts, 1015);
		if(c != null) {
			System.out.println("Account 1015 is found.");
		} else {
			System.out.println("Account 1015 is not found.");
		}
	}
	
	public static BankAccount findBankAccount(ArrayList<BankAccount> accounts, int account) {
		for(BankAccount ba: accounts) {
			if(ba.getAccountNumber() == account) {
				return ba;
			}
		}
		return null;
	}
}
