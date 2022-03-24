package com.alzohar.collection.queue.events;

import java.util.Date;

public class Event {

	public int id;
	public String name;
	public Date createDate;
	public Date expireDate;
	public String eventType;

	public Event() {
		super();
	}

	public Event(int id, String name, Date createDate, Date expireDate, String eventType) {
		super();
		this.id = id;
		this.name = name;
		this.createDate = createDate;
		this.expireDate = expireDate;
		this.eventType = eventType;
	}

	public Event(int id, String name, String eventType) {
		super();
		this.id = id;
		this.name = name;
		this.eventType = eventType;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", createDate=" + createDate + ", expireDate=" + expireDate
				+ ", eventType=" + eventType + "]";
	}

}
