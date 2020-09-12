package com.cv.collection.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIndexOfDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Java");
		ll.add("J2EE");
		ll.add("Spring");
		ll.add("Angular");
	 
		ArrayList<String> al = new ArrayList<>();
		
		al.add("NodeJs");
		al.add("MongoDB");
		
		// al.addAll(ll);
		System.out.println("ArrayList: " +al);
		
		ll.addAll(al);
		
		System.out.println("LinkedList: " + ll);
	}

}
