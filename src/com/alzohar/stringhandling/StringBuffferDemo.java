package com.alzohar.stringhandling;

public class StringBuffferDemo {

	public static void main(String[] args) {

		// StringBuffer is allow to create a mutable string.
		// String buffer tread safe.

		StringBuffer message = new StringBuffer("Today is a good day!");

		System.out.println(message);

		// start modification
		message.append(" Happy Learning");
		System.out.println(message);

		// replace text
		message.replace(0, 1, "t");
		System.out.println(message);

		// delete text
		message.delete(0, 2);
		System.out.println(message);

		// insert text
		message.insert(0, "Welcome, To");
		System.out.println(message);
	}

}
