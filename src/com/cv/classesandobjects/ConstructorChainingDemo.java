/**
 * 
 */
package com.cv.classesandobjects;

/**
 * @author channaveer.p
 *
 *         Constructor Chaining is a technique of calling another constructor
 *         from one constructor. this() is used to call same class constructor
 *         where as super() is used to call super class constructor.
 */

class Superclass {
	public Superclass(int i) {
		System.out.println("Super class constructor: " + i);
	}

}

class Subclass extends Superclass {

	public Subclass() {
		this(10);
	}

	public Subclass(int i) {
		super(i);
	}


}

public class ConstructorChainingDemo {


	public static void main(String[] args) {
		Subclass sc = new Subclass();

	}

}
