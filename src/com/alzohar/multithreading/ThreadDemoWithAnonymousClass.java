package com.alzohar.multithreading;

public class ThreadDemoWithAnonymousClass {

	public static void main(String[] args) {
		// create object of usman

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread One Is Running !");
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread Two Is Running !");
			}
		});
		t2.start();
	}

}
