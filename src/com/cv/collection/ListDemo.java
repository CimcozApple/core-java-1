package com.cv.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
 
		List<String> l = new ArrayList<>();
		
		l.add("a");
		l.add("b");
		l.add("c");
		
		l.remove(1);
		
		System.out.println(l);
		
	}

}
 