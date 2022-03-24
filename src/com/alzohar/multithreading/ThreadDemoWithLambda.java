package com.alzohar.multithreading;

public class ThreadDemoWithLambda {

	public static void main(String[] args) {
		// create thread t1

		Thread t1 = new Thread(() -> {
			System.out.println("Thread one is running");
		});

		t1.start();

		// create thread t1

		Thread t2 = new Thread(() -> {
			System.out.println("Thread two is running");
		});

		t2.start();
	}

}
