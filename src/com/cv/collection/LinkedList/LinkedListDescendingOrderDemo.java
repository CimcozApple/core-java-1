package com.cv.collection.LinkedList;

import java.util.LinkedList;

public class LinkedListDescendingOrderDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Java");
		ll.add("J2EE");
		ll.add("Spring");
		ll.add("Angular");
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}		
		System.out.println(ll);
		
		String s = "JSP";
		String s2 = "Spring";
		
		if(ll.contains(s)){
			System.out.println(ll.indexOf(s));
		}
		if(ll.contains(s2)){
			System.out.println(ll.indexOf(s2));
		}
		
	}

}
