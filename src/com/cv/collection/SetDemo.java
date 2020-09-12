package com.cv.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		
		
		s.add("Channaveer");
		s.add("Channaveers");
		s.add("Channaveerss");
		s.add(null);
		s.add("Patil");
		System.out.println(s);
	}
}
