package com.alzohar.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<String> listOfCities = new LinkedList<String>();

		listOfCities.add("New York");
		listOfCities.add("LA");
		listOfCities.add("New York");
		listOfCities.add("California");
		listOfCities.add("Hawai");
		listOfCities.add("Mumbai");
		listOfCities.add("Nagpur");

		System.out.println(listOfCities);

		System.out.println("Index : 3 :>" + listOfCities.get(3));

		// iterator over list
		Iterator<String> itr = listOfCities.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---------------------");

		// for loop with counter
		for (int index = 0; index < args.length; index++) {
			System.out.println("The Index :" + index + "And Name : " + listOfCities.get(index));
		}
		System.out.println("---------------------");

		// enhance for loop
		for (String name : listOfCities) {
			System.out.println("The Name : " + name);
		}

	}

}
