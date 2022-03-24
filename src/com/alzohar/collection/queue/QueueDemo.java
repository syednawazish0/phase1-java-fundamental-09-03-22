package com.alzohar.collection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// Queue is a data structure which works in first in first out order.

		Queue<String> peopleQueue = new ArrayDeque<String>();

		peopleQueue.add("Bob");
		peopleQueue.add("Mike");
		peopleQueue.add("Will");
		peopleQueue.add("Merk");
		peopleQueue.add("Sam");
		peopleQueue.add("David");

		System.out.println(peopleQueue);

		// peek -> checking top element
		System.out.println("HEAD :>" + peopleQueue.peek());
		System.out.println("HEAD :>" + peopleQueue.element());

		// remove element from head

		String removeElem = peopleQueue.poll();
		System.out.println("Removed elem :>" + removeElem);

		String removeELem2 = peopleQueue.poll();
		System.out.println("Removed Element :> " + removeELem2);

		System.out.println(peopleQueue);
		System.out.println("---------------------");

		// iteration over
		for (String person : peopleQueue) {
			System.out.println(person);
		}
		System.out.println("-------------------");

		Queue<String> bankQueue = new PriorityQueue<String>();

		bankQueue.add("William");
		bankQueue.add("Marry");
		bankQueue.add("Sam");
		bankQueue.add("David");
		bankQueue.add("Kim");
		bankQueue.add("Yeen");

		System.out.println(bankQueue);
		// peek -> checking top element

		System.out.println("Head :> " + bankQueue.peek());
		System.out.println("Head :> " + bankQueue.element());

		// remove element from head
		String removed = bankQueue.poll();
		System.out.println("Removed elem :> " + removed);
	}

}
