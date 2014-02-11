package com.mss.multicolumnsortinglist;

import java.util.Comparator;

/**
 * This comparator compares two employees by their job titles.
 * 
 * @author Master Software Solutions
 * 
 */
public class EmployeeJobTitleComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) {
		return firstEmployee.getJobTitle().compareTo(secondEmployee.getJobTitle());
	}
}
