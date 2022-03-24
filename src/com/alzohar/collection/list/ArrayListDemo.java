package com.alzohar.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> listOfCompanies = new ArrayList<String>();

		listOfCompanies.add("WIPRO");
		listOfCompanies.add("DELL");
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("GOOGLE");
		listOfCompanies.add("SIMPLILEARN");

		System.out.println(listOfCompanies);
		System.out.println("Index : 3 :> " + listOfCompanies.get(3));
		System.out.println("----------------");
		// iteration over list

		Iterator<String> itr = listOfCompanies.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---------------------");

		// for loop with counter
		for (int index = 0; index < args.length; index++) {
			System.out.println("The Index :" + index + "And Name : " + listOfCompanies.get(index));
		}
		System.out.println("---------------------");

		// enhance for loop
		for (String name : listOfCompanies) {
			System.out.println("The Name : " + name);
		}
	}

}
