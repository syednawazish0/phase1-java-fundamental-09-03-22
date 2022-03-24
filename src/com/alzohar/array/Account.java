package com.alzohar.array;

public class Account {

	public long accNo;
	public String name;
	public double balance;
	public String bankName;

	public Account() {
		super();
	}

	public Account(long accNo, String name, double balance, String bankName) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", bankName=" + bankName + "]";
	}

}
