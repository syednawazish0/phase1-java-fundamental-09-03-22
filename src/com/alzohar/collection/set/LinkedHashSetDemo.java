package com.alzohar.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		// Linked HashSet

		Set<String> setOfUniqueBrands = new LinkedHashSet<String>();

		setOfUniqueBrands.add("Nike");
		setOfUniqueBrands.add("Addidas");
		setOfUniqueBrands.add("Fila");
		setOfUniqueBrands.add("Asics");
		setOfUniqueBrands.add("Nike");
		setOfUniqueBrands.add("Puma");
		setOfUniqueBrands.add("Nike");
		setOfUniqueBrands.add("Fila");

		System.out.println(setOfUniqueBrands);
		System.out.println("------------------");

		// set iteration with iterator

		Iterator<String> itr = setOfUniqueBrands.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		// set iteration with iterator
		for (String brand : setOfUniqueBrands) {
			System.out.println("The Brand :" + brand);
		}
	}

}
