package com.alzohar.collection.list.shop;

import java.util.List;
import java.util.Vector;

public class ShopList {

	public static void main(String[] args) {

		Shop shop1 = new Shop(101, "Nazi Online Store", "Taj Colony Pulgaon", "Its Electronic Store");
		Shop shop2 = new Shop(102, "Tony Fruits", "Gandhi Chowck Pulgaon", "Its Fruits Store");
		Shop shop3 = new Shop(103, "Shahid Mobile Shopee", "Taj Colony Pulgaon", "Its Mobile Store");
		Shop shop4 = new Shop(104, "Rahezam Kirana Store", "Mahadevpura Wardha", "Its Kirana Store");

		List<Shop> shopList = new Vector<Shop>();

		shopList.add(shop4);
		shopList.add(shop2);
		shopList.add(shop1);

		for (Shop shop : shopList) {
			System.out.println(shop.id);
			System.out.println(shop.name);
			System.out.println(shop.address);
			System.out.println(shop.discription);
			System.out.println("---------------------");

		}
	}

}
