package com.alzohar.method;

public class MethodDemo {

	public static void main(String[] args) {

		MethodDemo demo = new MethodDemo();
		
		//method declaration 
		demo.showMessage();
		System.out.println("----------------");
		demo.displayAuthor("John Smith");
		System.out.println("----------------");
		demo.ageCalculator(1997);
		System.out.println("----------------");
		demo.retirementCalc("Mitchel Stark", 1990);
		System.out.println("----------------");
		demo.retirementCalc("David Warner", 1899);
	}
	// user defined methods
	// 1. non parameterized method
	// 2. parameterized method

	// methods deceleration
	// non parameterized method
	public void showMessage() {
		System.out.println("Welcome to java methods");
	}

	// one parameterized methods
	public void displayAuthor(String author) {
		System.out.println("The Author :" + author);
	}

	public int ageCalculator(int yearOfBirth) {
		int age = 2022 - yearOfBirth;
		System.out.println("The user age is : " + age);
		return age;
	}

	// two parameterized methods
	public void retirementCalc(String username, int yearOfBirth) {
		int age = ageCalculator(yearOfBirth);
		if (age > 60) {
			System.out.println("Hi , " + username + " You are already retired.");
		} else {
			System.out.println("Hi , " + username + "you have " + (60 - age) + "year for retirement");
		}
	}

}
