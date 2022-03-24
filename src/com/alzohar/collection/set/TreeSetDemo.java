package com.alzohar.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// Treeset arrange data into asc order
		TreeSet<String> setOfUniqueName = new TreeSet<String>();
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		TreeSet<Double> set2 = new TreeSet<Double>();

		setOfUniqueName.add("Ram");
		setOfUniqueName.add("Ganya");
		setOfUniqueName.add("Krishna");
		setOfUniqueName.add("Mahadev");
		setOfUniqueName.add("SaiBaba");
		setOfUniqueName.add("Mushak");
		setOfUniqueName.add("Hanuman");

		System.out.println(setOfUniqueName);
		System.out.println("------------------");
		System.out.println(setOfUniqueName.descendingSet());
		System.out.println("------------------");

		// set iteration with iterator

		Iterator<String> itr = setOfUniqueName.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------------------");
		// set iteration with iterator
		for (String name : setOfUniqueName) {
			System.out.println("The Name :" + name);
		}

	}

}
