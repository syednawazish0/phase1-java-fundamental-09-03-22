package com.alzohar.array;

import java.util.Arrays;

public class PriceArray {

	public static void main(String[] args) {

		float[] price = new float[5];

		price[0] = (float) 145.66;
		price[1] = (float) 123.44;
		price[2] = (float) 124.11;
		price[3] = (float) 543.46;
		price[4] = (float) 856.77;

		System.out.println(Arrays.toString(price));
		System.out.println("------------------------");
		System.out.println(price[1]);
		System.out.println(price[4]);
		System.out.println("------------------------");
		for (int index = 0; index < price.length; index++) {
			System.out.println(price[index]);
		}
	}

}
