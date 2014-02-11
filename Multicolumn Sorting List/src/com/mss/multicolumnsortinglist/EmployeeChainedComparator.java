package com.mss.multicolumnsortinglist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * This is a chained comparator that is used to sort a list by multiple
 * attributes by chaining a sequence of comparators of individual fields
 * together.
 * 
 * @author Master Software Solutions
 * 
 */
public class EmployeeChainedComparator implements Comparator<Employee> {

	private List<Comparator<Employee>>	listComparators;

	@SafeVarargs
	public EmployeeChainedComparator(Comparator<Employee>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) {
		for (Comparator<Employee> comparator : listComparators) {
			int result = comparator.compare(firstEmployee, secondEmployee);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}