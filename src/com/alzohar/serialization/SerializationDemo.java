package com.alzohar.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		// step create an object
		Employee employee = new Employee(1001, "John Smith", "Engineering", 2435.77);

		// step 2: create a byte stream
		try {
			FileOutputStream file = new FileOutputStream("file-db.txt");
			
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);

			// method to serialize object
			out.writeObject(employee);

			System.out.println("Serialization is complete !");
			out.close();
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} 

	}

}
