/**
 * 
 */
package com.cv.memorymanagement;

/**
 * @author channaveer.p
 *
 *
 *         Let’s start with simple definitions of class and object.
 * 
 *         Class : Class is the model/template/blueprint for the objects to be
 *         created of its type.
 * 
 *         Object : It is an instance of a class. It is the real-time copy of
 *         class.
 * 
 */

class StaticVsNonStatic {

	/**
	 * 
	 * Non-Static variables and Non-Static methods are non-static components of
	 * a class. These are also called instance components of a class. Non-static
	 * components are stored inside the object memory. Each object will have
	 * their own copy of non-static components. But, static components are
	 * common to all objects of that class.
	 * 
	 */

	int nonStaticVariable;
	static int staticVariable;

	static void staticMethod() {
		System.out.println("Inside static method");
	}

	public void nonStaticMethod() {
		System.out.println("Inside non Static method");
	}
}

public class NonStaticMembersAndMemoryManagement {


	public static void main(String[] args) {

		StaticVsNonStatic.staticVariable = 10;

		// not accessible because its non static variable;
		// StaticVsNonStatic.nonStaticVariable = 20;

		StaticVsNonStatic.staticMethod();

		// not accessible because its non static method;
		// StaticVsNonStatic.nonStaticMethod();

		StaticVsNonStatic staticVsNonStatic = new StaticVsNonStatic();

		staticVsNonStatic.nonStaticVariable = 200;

		staticVsNonStatic.nonStaticMethod();

	}

}
