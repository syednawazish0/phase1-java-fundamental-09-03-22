package com.alzohar.method.shop;

public class ShopOperation {

	public String shopName = "Nazi Laptop & Accessories";

	// show product
	public String showProduct(Shop shop) {
		if (shop != null) {
			return shop.name;
		}
		return null;
	}

	// buy product

	public String buyProduct(Shop shop, int id) {
		if (id == shop.id) {
			System.out.println("Product Buy Successfully : " + id);
			return shop.name;
		} else {
			System.out.println("Invalid Product Id : " + id);
			return null;
		}
	}

	public String sellProduct(Shop shop, int id) {
		if (id == shop.id) {
			System.out.println("Product Sell Successfully :" + id);
			return shop.name;
		} else {
			System.out.println("Invalid Product Id :" + id);
			return null;
		}
	}
}
