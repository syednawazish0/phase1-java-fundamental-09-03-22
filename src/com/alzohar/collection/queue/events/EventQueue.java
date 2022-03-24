package com.alzohar.collection.queue.events;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Queue;

public class EventQueue {

	public static void main(String[] args) {

		Event event1 = new Event(101, "Gadring", new Date(), new Date(), "Dance");
		Event event2 = new Event(102, "Gadring", new Date(), new Date(), "Dramas");
		Event event3 = new Event(103, "Gadring", new Date(), new Date(), "Speech");
		Event event4 = new Event(104, "Gadring", new Date(), new Date(), "Price Ceremony");

		Queue<Event> queue = new ArrayDeque<Event>();

		queue.add(event1);
		queue.add(event2);
		queue.add(event3);
		queue.add(event4);

		for (Event event : queue) {
			System.out.println(event.id);
			System.out.println(event.name);
			System.out.println(event.createDate);
			System.out.println(event.expireDate);
			System.out.println(event.eventType);
			System.out.println("--------------------");
		}

	}

}
