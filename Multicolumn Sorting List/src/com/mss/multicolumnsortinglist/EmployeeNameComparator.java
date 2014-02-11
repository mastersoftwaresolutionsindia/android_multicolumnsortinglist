package com.mss.multicolumnsortinglist;

import java.util.Comparator;

/**
 * This comparator compares two employees by their salaries.
 * 
 * @author Master Software Solutions
 * 
 */
public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) {
		return firstEmployee.getName().compareTo(secondEmployee.getName());
	}

}
