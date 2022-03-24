package com.alzohar.collection.map.student;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {

		Map<String, Student> studentMap = new LinkedHashMap<String, Student>();

		studentMap.put("Nawazish", new Student(1101, "Syed Nawazish Ali", 11));
		studentMap.put("Shahid", new Student(1102, "Shahid Khan", 11));
		studentMap.put("Haris", new Student(1103, "Haris Siddiqui", 11));
		studentMap.put("Mujtaba", new Student(1104, "Mujtaba Khan", 11));
		studentMap.put("Asfar", new Student(1105, "Asfar Ahmed", 11));
		studentMap.put("Rizwan", new Student(1106, "Mohd.Rizwan", 11));

		System.out.println(studentMap);

		for (Map.Entry<String, Student> entry : studentMap.entrySet()) {

			System.out.println(" Key : " + entry.getKey());
			System.out.println(" Value : " + entry.getValue());
			System.out.println("--------------");
		}

	}

}
