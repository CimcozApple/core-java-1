package com.cv.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateParse {

	public static void main(String[] args) {

		String currDate = "";
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		
		
		String lastDate = "2016-12-30 12:27:58.000000";
		
		Date date = new Date();
		System.out.println(date);
		try {
			date = dateFormat.parse(lastDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
	}

}
