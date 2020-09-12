package com.cv.collection.LinkedList;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();
		
		queue.offer("AAA");
		queue.offer("BBB");
		queue.offer("CCC");
		
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
