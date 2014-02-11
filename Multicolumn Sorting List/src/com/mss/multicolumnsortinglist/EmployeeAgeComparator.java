package com.mss.multicolumnsortinglist;

import java.util.Comparator;

/**
 * This comparator compares two employees by their ages.
 * 
 * @author Master Software Solutions
 * 
 */
public class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) {
		return firstEmployee.getAge() - secondEmployee.getAge();
	}
}
