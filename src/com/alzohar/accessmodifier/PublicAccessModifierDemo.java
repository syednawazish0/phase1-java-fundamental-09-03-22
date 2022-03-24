package com.alzohar.accessmodifier;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {
		Govn govn = new Govn();

		System.out.println("The Public Tranport is : " + govn.transportation);
		System.out.println("The Public park is : " + govn.park);
		System.out.println("The Public assets is : " + govn.assets);

		System.out.println(govn.showPark());
		System.out.println(govn.showPublicAssets());
	}
}

class Govn {
	// public Variable
	public String transportation = " Train";
	public String park = " XYZ park";
	public double assets = 432856357d;

//	public method 
	public double showPublicAssets() {
		return assets;
	}

	public String showPark() {
		return park;
	}

	// public constructor
	public Govn() {
	}
}
