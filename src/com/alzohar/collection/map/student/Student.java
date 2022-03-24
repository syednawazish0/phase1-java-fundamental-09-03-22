package com.alzohar.collection.map.student;

public class Student {

	public int rollNum;
	public String name;
	public int standard;

	public Student() {
		super();
	}

	public Student(int rollNum, String name, int standard) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", standard=" + standard + "]";
	}

}
