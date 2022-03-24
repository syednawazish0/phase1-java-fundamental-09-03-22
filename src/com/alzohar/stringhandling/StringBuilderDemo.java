package com.alzohar.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {

		// StringBuilder is allow to create a mutable string.
		// String builder is not tread safe.

		StringBuilder text = new StringBuilder("Today is wonderfull day!");
		System.out.println(text);

		// append text
		text.append(" Keep Learning !");
		System.out.println(text);

		// replace text
		text.replace(0, 1, "t");
		System.out.println(text);

		// delete text
		text.delete(0, 2);
		System.out.println(text);

		// insert text
		text.insert(0, "Welcome, To");
		System.out.println(text);

	}

}
