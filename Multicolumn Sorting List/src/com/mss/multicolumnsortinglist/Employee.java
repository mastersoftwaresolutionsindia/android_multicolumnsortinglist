package com.mss.multicolumnsortinglist;

/**
 * This class holds the details of an employee
 * 
 * @author Master Software Solutions
 * 
 */
public class Employee {
	private String	name;
	private String	jobTitle;
	private int		age;
	private int		salary;

	/**
	 * Constructor of the Employee class
	 * 
	 * @param name
	 * @param jobTitle
	 * @param age
	 * @param salary
	 */
	public Employee(String name, String jobTitle, int age, int salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * returns the name of employee
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * set the employee name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * returns the job title of employee
	 * 
	 * @return String
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * set the job title of employee
	 * 
	 * @param jobTitle
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * returns the age of employee
	 * 
	 * @return int
	 */
	public int getAge() {
		return age;
	}

	/**
	 * set the age of employee
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * returns the salary of the employee
	 * 
	 * @return int
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * set the salary of employee
	 * 
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
}