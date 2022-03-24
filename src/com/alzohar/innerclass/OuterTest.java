package com.alzohar.innerclass;

public class OuterTest {

	// data variable
	private double amount = 23423.44;
	public String message = "Today is a good day !";

	// non static inner class

	class InnerTest {
		private String data = " Hello & Welcome ";

		public void showData() {
			System.out.println("Outer class data " + amount);
			System.out.println("Outer class data " + message);
			System.out.println("Outer class data " + data);
		}
	}

	public static void main(String[] args) {

		// create outer class object
		OuterTest outer = new OuterTest();

		// create inner class object from outer clas object
		InnerTest inner = outer.new InnerTest();

		inner.showData();
	}

}
