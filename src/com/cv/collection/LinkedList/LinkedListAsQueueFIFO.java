package com.cv.collection.LinkedList;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListAsQueueFIFO {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		// Iterable<T>
		//Collection<E>
		// Heterogeneous datatype allowed
		ll.add("John");
		ll.add(30);
		ll.add(null);
		ll.add("durga");
		ll.set(0, "Smith");
		ll.add(0, "Steve");
		ll.removeLast();
		ll.addFirst("Job");
		System.out.println(ll);
	}
}
