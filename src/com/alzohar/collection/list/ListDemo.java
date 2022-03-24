package com.alzohar.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

		// List -> Order collection of data with duplicates elements.
		// List (interface) -> imp classes -> ArrayList, LinkedList , Vector , Stack

		// list deleraction
		List<String> list1 = new ArrayList<String>();// backed by dynamic array, not thread safe, read operations
		List<String> list2 = new LinkedList<String>(); // backed by doubly linkedlist ,not thread safe, -> insert,
														// delete,replace
		List<String> list3 = new Vector<String>(); // thread safe collection
		List<String> list4 = new Stack<String>(); // thread safe collection

		List<String> userList = new ArrayList<>();

		// insert user data
		userList.add("Bob");
		userList.add("Mike");
		userList.add("Will");
		userList.add("Merk");
		userList.add("Sam");

		System.out.println(userList);

		System.out.println("The Element at index 2: " + userList.get(2));
		System.out.println("The Element at index 2: " + userList.get(4));

		System.out.println("------------------");
		userList.add(2, "Mark");
		System.out.println(userList);

		System.out.println("----------------");
		userList.remove(2);
		System.out.println(userList);

		System.out.println("------------------");
		// iteration over list

		Iterator<String> itr = userList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (int index = 0; index < args.length; index++) {
			System.out.println("The Index : " + index + "and name : " + userList.get(index));
		}

		System.out.println("----------------");
		// enhance for loop
		for (String name : userList) {
			System.out.println("The name : " + name);
		}
	}

}
