package com.cv.calenderdemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("MMM/dd/yyyy");
		
		Calendar calender = Calendar.getInstance();
		
		/*System.out.println(calender.getTime());
		
		System.out.println(calender.get(1));
		System.out.println(calender.get(2));
		System.out.println(calender.get(5));
		
		System.out.println(dateFormat.format(calender.getTime()));
		
		// dateBeforeTenYears.get(1),dateBeforeTenYears.get(2)-120,dateBeforeTenYears.get(5)
		calender.set(calender.get(1), calender.get(2), calender.get(5));
		System.out.println("Current Date: "+ dateFormat.format(calender.getTime()));
		
		calender.set(calender.get(1), calender.get(2)-12, calender.get(5));
		System.out.println("Edited Date: "+dateFormat.format(calender.getTime()));*/
		
		calender.set(2015,11,24);
		
		System.out.println(dateFormat.format(calender.getTime()));
		
	}
	
}
