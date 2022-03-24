package com.alzohar.filehandling;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	public long accNo;
	public String name;
	public String email;
	public double balance;

	public Account() {
		super();
	}

	public Account(long accNo, String name, String email, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}

}
