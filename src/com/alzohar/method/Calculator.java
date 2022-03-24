package com.alzohar.method;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		CalcOpr calcOpr = new CalcOpr();

		// step 1. collect input from user console.
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println(" :: Welcome to Arithmatic Calculator :: ");
		System.out.println(CalcOpr.CalcName);
		System.out.println("-----------------------------------");

		System.out.println(" :: Enter a number 1 vaule :: ");
		int x = input.nextInt();

		System.out.println(" :: Enter a number 2 vaule :: ");
		int y = input.nextInt();

		float result1 = calcOpr.add(x, y);
		System.out.println("The Addition is : " + result1);

		float result2 = calcOpr.sub(x, y);
		System.out.println("The Subtraction is: " + result2);

		float result3 = calcOpr.mul(x, y);
		System.out.println("The multiplication is : " + result3);

		float result4 = CalcOpr.div(x, y);
		System.out.println("The division is : " + result4);

		double result5 = calcOpr.avg(x, y);
		System.out.println("The Average is :" + result5);

	}

}

class CalcOpr {
	public static String CalcName = "BasdCalculous";

	// Addition
	public float add(int num1, int num2) {
		return num1 + num2;
	}

	// Subtraction
	public float sub(int num1, int num2) {
		return num1 - num2;
	}

	// Multiplication
	public float mul(int num1, int num2) {
		return num1 * num2;
	}

	// division
	public static float div(int num1, int num2) {
		return num1 / num2;
	}

	// average
	public static double avg(int num1, int num2) {
		return (num1 + num2) / 2;

	}
}
