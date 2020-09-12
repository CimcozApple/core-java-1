
package com.cv.anonymous;


/**
 * 
 * @author channaveer.p
 *
 * It is an inner class without a name and for which only a single object is created. 
 * An anonymous inner class can be useful when making an instance of an object with 
 * certain “extras” such as overloading methods of a class or interface, without having 
 * to actually subclass a class.
 * 
 */

interface Add{
	void add(int a, int b);
}

public class AnanymousDemo {

	public static void main(String[] args) {

		Add a = new Add() {
 
			@Override
			public void add(int a, int b) {
				int c = a + b;
				System.out.println("Addition: " +c);
			}

		};

		a.add(2, 3);
	}
}
