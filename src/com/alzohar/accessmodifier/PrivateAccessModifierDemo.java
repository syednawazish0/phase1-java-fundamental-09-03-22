package com.alzohar.accessmodifier;

public class PrivateAccessModifierDemo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
//		account.balance;  //compile time error
//		account.fdAmount;//compile time error
//		account.showBalance(); // compile time error

		account.printAll();
	}
}

class BankAccount {
	// private variable : properties : data members
	private double balance = 43224.45;
	private double fdAmount = 53466.45;

	// private methods : member function
	private double showBalance() {
		return balance;
	}

	private double showFdAmount() {
		return fdAmount;
	}

	public void printAll() {
		System.out.println("The Balance : " + balance + " & fd amount : " + fdAmount);
	}
}
