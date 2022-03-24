package com.alzohar.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		// arrays is an ordered collection of similar type of data elements.
		int[] numbers = { 10, 20, 30, 40, 50, 60 };
		int collNumbers[] = { 100, 200, 300, 400, 500, 600 };

		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(collNumbers));

		// access elements by index
		System.out.println("Element at index 0 :> " + numbers[0]);
		System.out.println("Element at index 5 :>" + collNumbers[5]);

//		System.out.println("Element at index 7 :> " + numbers[6]);ArrayIndexOutOfBoundsException

		System.out.println("Element at last index Number lenght-1 :> " + numbers[numbers.length - 1]);

		// Access elements with iteration
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("Element at index : " + index + " Value : " + numbers[index]);

		}

	}

}
