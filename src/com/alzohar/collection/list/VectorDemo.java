package com.alzohar.collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		List<String> listOfFruits = new Vector<String>();
		List<Integer> listOfQuantity = new Vector<Integer>();

		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Mango");
		listOfFruits.add("Kiwi");

		System.out.println(listOfFruits);

		System.out.println("Index : 3 :>" + listOfFruits.get(3));

		// iteration over list

		Iterator<String> itr = listOfFruits.iterator();
		while (itr.hasNext())
			;
		System.out.println(itr.next());

		System.out.println("--------------------");

		// for loop with counter
		for (int index = 0; index < args.length; index++) {
			System.out.println("The Index :" + index + "and name : " + listOfFruits.get(index));
		}
		System.out.println("-----------------------");
		// enhance for loop
		for (String name : listOfFruits) {
			System.out.println("The Name : " + name);
		}
	}

}
