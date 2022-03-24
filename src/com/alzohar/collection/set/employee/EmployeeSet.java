package com.alzohar.collection.set.employee;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.alzohar.collection.list.employee.Employee;

public class EmployeeSet {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 62875.55);
		Employee employee2 = new Employee(1002, "David Warner", "HR", 82875.55);
		Employee employee3 = new Employee(1003, "Salman Butt", "HR", 602875.55);
		Employee employee4 = new Employee(1004, "Steave Smith", "Engineering", 52875.55);
		Employee employee5 = new Employee(1005, "Micheal Clark", "Operation", 662875.55);

		// create a set
		Set<Employee> empSet = new LinkedHashSet<Employee>();
		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);
		empSet.add(employee4);
		empSet.add(employee5);

		System.out.println(empSet);
		System.out.println("------------------");

		// set iteration with iterator
		Iterator<Employee> itr = empSet.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			Employee employee = itr.next();
			System.out.println(employee.id);
			System.out.println(employee.name);
			System.out.println(employee.salary);
			System.out.println(employee.dept);
			System.out.println("------------------");
		}
	}

}
