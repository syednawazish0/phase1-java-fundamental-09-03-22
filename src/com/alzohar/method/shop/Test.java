package com.alzohar.method.shop;

public class Test {

	public static void main(String[] args) {
		// create a shop object
		Shop shop = new Shop(100, "Apple Macbook", 123984.34, "It is laptop");

		// create a shop operation object
		ShopOperation sp = new ShopOperation();
		System.out.println("Welcome to the Shop :: '" + sp.shopName + " ' ");

		System.out.println("Products : " + sp.showProduct(shop));

		System.out.println("===================");

		System.out.println("Buy a product :" + sp.buyProduct(shop, 100));
		System.out.println("===================");
		
		System.out.println("Sell A Product : " + sp.sellProduct(shop, 100));
	}
}
