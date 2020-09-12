package com.cv.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitLogic {

	public static void main(String[] args) {

		String supportMail = "DL-BA-INDIA-BG-HMS-Rebill@evry.com";
		
		List<String> l = new ArrayList<String>();
		
		l.addAll(Arrays.asList(supportMail.split(";")));
		
		System.out.println(l);
		System.out.println(l.get(0));
	}

}
