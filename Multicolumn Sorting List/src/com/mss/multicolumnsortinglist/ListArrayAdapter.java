package com.mss.multicolumnsortinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * This class populates the Adapter with employee details
 * 
 * @author Master Software Solutions
 * 
 */
public class ListArrayAdapter extends ArrayAdapter<String> {

	private TextView	txtName;
	private TextView	txtTitle;
	private TextView	txtSalary;
	private TextView	txtAge;

	private Context		context;
	private String[]	names;
	private int[]		salary;
	private String[]	title;
	private int[]		age;

	/**
	 * Constructor of the ListArrayAdapter
	 * 
	 * @param context
	 * @param salary
	 * @param title
	 * @param names
	 * @param age
	 */
	public ListArrayAdapter(Context context, int[] salary, String[] title, String[] names, int[] age) {

		super(context, R.layout.list_row, names);
		this.context = context;
		this.names = names;
		this.salary = salary;
		this.title = title;
		this.age = age;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_row, null, true);

		txtName = (TextView) rowView.findViewById(R.id.textView1);
		txtTitle = (TextView) rowView.findViewById(R.id.textView2);
		txtAge = (TextView) rowView.findViewById(R.id.textView3);
		txtSalary = (TextView) rowView.findViewById(R.id.textView4);

		txtName.setText(names[position]);
		txtTitle.setText(title[position]);
		txtSalary.setText("" + salary[position]);
		txtAge.setText("" + age[position]);

		if ((position % 2) == 0)
			rowView.setBackgroundResource(R.drawable.altercolor);

		return rowView;
	}
}
