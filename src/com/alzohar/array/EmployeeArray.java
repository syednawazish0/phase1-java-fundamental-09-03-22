package com.alzohar.array;

import java.util.Arrays;

public class EmployeeArray {

	public static void main(String[] args) {

		// create employee array

		Employee[] empList = new Employee[5];

		// insert data into employee array

		empList[0] = new Employee(1001, "John", "Engineering", 68783.33);
		empList[1] = new Employee(1002, "Mike", "Dev", 7984.22);
		empList[2] = new Employee(1003, "Will", "HR", 53974.55);

		System.out.println(Arrays.toString(empList));

		System.out.println(empList[1]);
		System.out.println(empList[2]);
	}

}
