package com.alzohar.innerclass;

public class OuterTest2 {

	// data variable
	private static double amount = 54312.45;
	public static String message = "Today is a good day !";

	// static inner class

	static class InnerTest {
		private String data = " Hello & Welcome";

		public void showData() {
			System.out.println("Outer class data " + amount);
			System.out.println("Outer class data " + message);
			System.out.println("Outer class data " + data);
		}
	}

	public static void main(String[] args) {

		// create inner class object from outer class object
		InnerTest inner = new OuterTest2.InnerTest();
		inner.showData();
	}

}
