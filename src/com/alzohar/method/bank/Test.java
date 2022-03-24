package com.alzohar.method.bank;

public class Test {

	public static void main(String[] args) {

		// create a account object
		Account acc = new Account(11223344, 50000.44, "Iron Man", "iron.man12@ironbank.com");

		// create a bank operation object
		BankOperation opr = new BankOperation();

		System.out.println("Welcome to the bank :: '" + opr.bankName + " ' ");

		System.out.println("The user balance : " + opr.showBalance(acc));

		System.out.println("The user balance after deposit: " + opr.depositAmt(acc, 1000.56));
		System.out.println("The user balance after deposit: " + opr.depositAmt(acc, 5000.00));

		System.out.println("the user balance after withdraw : " + opr.withdrawAmt(acc, 1000.56));
		System.out.println("the user balance after withdraw :" + opr.withdrawAmt(acc, 5000.00));

	}

}
