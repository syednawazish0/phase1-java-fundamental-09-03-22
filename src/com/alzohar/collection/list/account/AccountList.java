package com.alzohar.collection.list.account;

import java.util.LinkedList;
import java.util.List;

public class AccountList {

	public static void main(String[] args) {

		Account account1 = new Account(10011, 98275.44, "Saif", "Saif@gmail.com");
		Account account2 = new Account(10012, 08275.44, "Rahezam", "Rahezam@gmail.com");
		Account account3 = new Account(10013, 18275.44, "Tauheed", "Tauheed@gmail.com");
		Account account4 = new Account(10014, 22275.44, "Shahid", "Shahid@gmail.com");
		Account account5 = new Account(10015, 66275.44, "Saqib", "Saqib@gmail.com");

		List<Account> accList = new LinkedList<Account>();

		accList.add(account5);
		accList.add(account4);
		accList.add(account2);

//		// insert data at index
//		accList.add(0, account3);

		// replace
		// accList.set(3, account1);
		// iterations

		for (Account account : accList) {

			System.out.println(account);

			System.out.println("Account Number : " + account.accNo);
			System.out.println("Username : " + account.username);
			System.out.println("Email: " + account.email);
			System.out.println("Balance : " + account.balance);

			System.out.println("---------------------");
		}
	}

}
