package com.mss.multicolumnsortinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * This class is used to show the list of employees
 * 
 * @author Master Software Solutions
 * 
 */
public class MainActivity extends Activity {

	ListView			listView;
	ListArrayAdapter	adapter;

	String				names[];
	String				title[];
	int[]				age;
	int[]				salary;

	List<Employee>		listEmployees	= new ArrayList<Employee>();

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.listView1);
		getList();
	}

	/**
	 * setting the list of employees in list
	 */
	public void getList() {

		listEmployees.add(new Employee(Config.TOM, 	Config.DEVELOPER, 45, 80000));
		listEmployees.add(new Employee(Config.TOM, 	Config.ANDROID, 45, 80000));
		listEmployees.add(new Employee(Config.SAM, 	Config.DESIGNER, 30, 75000));
		listEmployees.add(new Employee(Config.BOB, 	Config.DESIGNER, 45, 134000));
		listEmployees.add(new Employee(Config.PETER, Config.PROGRAMMER, 25, 60000));
		listEmployees.add(new Employee(Config.TIM, 	Config.DESIGNER, 45, 130000));
		listEmployees.add(new Employee(Config.CRAIG,Config.PROGRAMMER, 30, 52000));
		listEmployees.add(new Employee(Config.ANNE, Config.PROGRAMMER, 25, 51000));
		listEmployees.add(new Employee(Config.ANNE, Config.DESIGNER, 25, 51000));
		listEmployees.add(new Employee(Config.ALEX, Config.DESIGNER, 30, 120000));
		listEmployees.add(new Employee(Config.BILL, Config.PROGRAMMER, 22, 30000));
		listEmployees.add(new Employee(Config.BILL, Config.PROGRAMMER, 22, 40000));
		listEmployees.add(new Employee(Config.SAMUEL,Config.DEVELOPER, 28, 80000));
		listEmployees.add(new Employee(Config.JOHN,  Config.DEVELOPER, 35, 67000));
		listEmployees.add(new Employee(Config.PATRICK, Config.DEVELOPER, 35, 140000));
		listEmployees.add(new Employee(Config.ALICE, Config.PROGRAMMER, 35, 80000));
		listEmployees.add(new Employee(Config.DAVID, Config.DEVELOPER, 35, 99000));
		listEmployees.add(new Employee(Config.JANE, Config.DESIGNER, 30, 82000));

		/**
		 * You can use one single EmployeeComparator class instead of
		 * EmployeeNameComparator, EmployeeJobTitleComparator,
		 * EmployeeAgeComparator and EmployeeSalaryComparator
		 */
		Collections.sort(listEmployees, new EmployeeChainedComparator(new EmployeeComparator()));

		// Collections.sort(listEmployees, new EmployeeChainedComparator(new
		// EmployeeNameComparator(),
		// new EmployeeJobTitleComparator(),
		// new EmployeeAgeComparator(),
		// new EmployeeSalaryComparator())
		// );

		title = new String[listEmployees.size()];
		names = new String[listEmployees.size()];
		salary = new int[listEmployees.size()];
		age = new int[listEmployees.size()];

		int count = 0;
		for (Employee emp : listEmployees) {

			title[count] = emp.getJobTitle();
			names[count] = emp.getName();
			salary[count] = emp.getSalary();
			age[count] = emp.getAge();
			count++;
		}

		adapter = new ListArrayAdapter(getApplicationContext(), salary, title, names, age);
		listView.setAdapter(adapter);
	}
}
