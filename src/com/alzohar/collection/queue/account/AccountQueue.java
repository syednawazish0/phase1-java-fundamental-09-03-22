package com.alzohar.collection.queue.account;

import java.util.ArrayDeque;
import java.util.Queue;

public class AccountQueue {

	public static void main(String[] args) {
		Queue<Account> accountQueue = new ArrayDeque<Account>();

		// insert data into queue
		accountQueue.add(new Account(10001, 9579845.66, "John Smith", "johnsmith@gmail.com"));
		accountQueue.add(new Account(10002, 9579845.66, "Marry Smith", "marrysmith@gmail.com"));
		accountQueue.add(new Account(10003, 9579845.66, "William Smith", "williamsmith@gmail.com"));
		accountQueue.add(new Account(10004, 23974.55, "Sara Smith", "sarasmith@gmail.com"));
		accountQueue.add(new Account(10005, 593785.66, "Aria Smith", "ariasmith@gmail.com"));

		for (Account acc : accountQueue) {
			System.out.println(acc.accNo);
			System.out.println(acc.username);
			System.out.println(acc.balance);
			System.out.println(acc.email);
			System.out.println("---------------");
		}

	}

}
