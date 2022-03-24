package com.alzohar.typecasting;

public class StringToNumericConvrerter {

	public static void main(String[] args) {

		// String to numeric conversion : String value should be a convertible value.

		String price = "123"; // string literal => convertuble value
		String amount = "1232gf"; // non convertible string

		// String -> Non primitive type -> primitive value -> Wrapper class
		// Use Wrapper class for conversion :- int, float ,double >-> Integer , Float,
		// Double etc.

		int intPrice = Integer.parseInt(price);
		float floatPrice = Float.parseFloat(price);
		double doublePrice = Double.parseDouble(price);

		// double doubvleAmount = Double.parseDouble(amount); // NumberFormatException

		System.out.println("Float Price : " + floatPrice);
		System.out.println("Double Price : " + doublePrice);
		System.out.println("Integer Price : " + intPrice);
	}
}
