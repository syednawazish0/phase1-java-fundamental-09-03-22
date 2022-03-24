package com.alzohar.collection.set.fooditems;

public class Food {

	public int id;
	public String name;
	public double price;
	public String desc;

	public Food() {
		super();
	}

	public Food(int id, String name, double price, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + "]";
	}

}
