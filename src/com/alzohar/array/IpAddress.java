package com.alzohar.array;

import java.util.Arrays;

public class IpAddress {

	public static void main(String[] args) {

		String[] ipAdd = { "172.31.255.255", "192.168.255.255", "1.22.0.0", "1.38.0.0", "1.6.0.0" };

		System.out.println(Arrays.toString(ipAdd));

		System.out.println(ipAdd[2]);
		System.out.println(ipAdd[4]);

		for (int index = 0; index < ipAdd.length; index++) {

			System.out.println(ipAdd[index]);

		}
	}

}
