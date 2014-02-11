package com.mss.multicolumnsortinglist;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * This comparator compares two employees on the basis of different attributes
 * of Employee
 * 
 * @author Master Software Solutions
 * 
 */
public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) {
		return new CompareToBuilder().append(firstEmployee.getName(), secondEmployee.getName())
				.append(firstEmployee.getJobTitle(), secondEmployee.getJobTitle())
				.append(firstEmployee.getAge(), secondEmployee.getAge())
				.append(firstEmployee.getSalary(), secondEmployee.getSalary()).toComparison();
	}
}