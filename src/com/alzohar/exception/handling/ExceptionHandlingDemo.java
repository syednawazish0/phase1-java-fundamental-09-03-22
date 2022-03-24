package com.alzohar.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Program Started ...");
		try {
			int balance = 43563;
			int amount = 60;
			int result = balance / amount;
			System.out.println("Result Avg Balance Factor :" + result);
		} catch (Exception e) {
			System.out.println("Exception Occured and handled " + e.getClass());
		} finally {
			System.out.println("Always Runnig !");
		}
		System.out.println("Program is terminated !");
	}

}
