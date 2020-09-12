package com.cv.collection.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

class MyLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	static boolean detectloop(Node h) {

		HashSet<Node> hs = new HashSet<>();

		while (hs != null) {
			if (hs.contains(h))
				return true;
			hs.add(h);
			h = h.next;
		}

		return false;
	}
}

public class LinkedListCircular {
	public static void main(String[] args) {

		MyLinkedList llist = new MyLinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		llist.head.next.next = llist.head;

		System.out.println(MyLinkedList.detectloop(llist.head));

	}
}
