package com.cv.logic;

import java.util.ArrayList;
import java.util.List;

public class DeadCode {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		
		System.out.println(l.size());
		
		l.add("s");
		l.add(null);
		System.out.println(l.size());
		
		if (l == null) {
			System.out.println("Dead Code");
		}
		
		System.out.println(l.get(1));
		
	}

}
