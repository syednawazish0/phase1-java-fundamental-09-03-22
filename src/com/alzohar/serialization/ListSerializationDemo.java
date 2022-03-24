package com.alzohar.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ListSerializationDemo {

	public static void main(String[] args) {

		// step 1: create an list object

		List<Employee> list = new LinkedList<Employee>();

		// add employees into list

		list.add(new Employee(1001, "John Smith", "Engineering", 2435.77));
		list.add(new Employee(1002, "Will Smith", "Dev", 2435.77));
		list.add(new Employee(1003, "Marry Smith", "HR", 2435.77));
		list.add(new Employee(1004, "David Smith", "Engineering", 2435.77));

		// step 2: create a byte stream

		// create file output stream.

		try {
			FileOutputStream file = new FileOutputStream("list-db.txt");
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);

			// method to serialize object

			out.writeObject(list);

			System.out.println("Serialization is Complete");
			out.close();
			file.close();

		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}

	}

}
