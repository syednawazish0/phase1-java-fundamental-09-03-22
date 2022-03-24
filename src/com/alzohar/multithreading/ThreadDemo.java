package com.alzohar.multithreading;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		
		// create a thread object
		Thread mainThread = new ThreadDemo();
		//start a thread 
		mainThread.start();
	}
	
	@Override
	public void run() {
		//thread processing logic
		System.out.println("The Main Thread Is Running !");
	}

}
