package com.alzohar.collection.list.shop;

public class Shop {

	public int id;
	public String name;
	public String address;
	public String discription;

	public Shop() {
	}

	public Shop(int id, String name, String address, String discription) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", address=" + address + ", discription=" + discription + "]";
	}

}
