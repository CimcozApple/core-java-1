package com.cv.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJoinAnArrayList {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Java");
		ll.add("J2EE");
		ll.add("Spring");
		ll.add("Angular");
	 
		Iterator<String> itr = ll.descendingIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
