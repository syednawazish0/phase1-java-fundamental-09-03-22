package com.alzohar.array;

import java.util.Arrays;

public class AccountArray {

	public static void main(String[] args) {

		Account[] acc = new Account[5];

		acc[0] = new Account(100000, "Saif", 98745.55, "Bank Of Maharashtra");
		acc[1] = new Account(100001, "Shahid", 979342.40, "HDFC Bank");
		acc[2] = new Account(100002, "Haris", 86248.22, "State Bank Of India");
		acc[3] = new Account(100003, "Tauheed", 64353.44, "Axis Bank");
		acc[4] = new Account(100004, "Rahezam", 9758.55, "Bank Of Baroda");

		System.out.println(Arrays.toString(acc));
		System.out.println("=======================");

		for (int index = 0; index < acc.length; index++) {
			System.out.println(acc[index]);
		}
	}

}
