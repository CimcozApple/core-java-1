/**
 * 
 */
package com.cv.memorymanagement;

/**
 * @author channaveer.p
 *
 *         Static variables, Static Initialization Block and Static Methods –
 *         these all are static components or static members of a class. These
 *         static members are stored inside the Class Memory. To access static
 *         members, you need not to create objects. Directly you can access them
 *         with class name.
 * 
 *         Static Initialization Block is used to initialize only static
 *         variables. It is a block without a name. It contains set of
 *         statements enclosed within { }. The syntax of SIB looks like this,
 *
 */


class StaticComponents {
	static int staticVariable;

	static {
		System.out.println("Inside Static Block from class StaticComponents");
		staticVariable = 10;
	}

	static void staticMethod() {
		System.out.println("Inside static method");
		System.out.println("staticVariable: " + staticVariable);
	}
}

public class StaticInitializationBlock {
	
	static {
		System.out
				.println("Inside static block from class StaticInitializationBlock Main()");
	}

	/**
	 * 
	 * @param args
	 * 
	 *            When you trigger >java MainClass, java command divides
	 *            allocated memory into two parts – Stack and Heap. First, java
	 *            command enters stack memory for execution. First, it checks
	 *            whether MainClass is loaded into heap memory or not. If it is
	 *            not loaded, loading operation of MainClass starts. Randomly
	 *            some memory space is allocated to MainClass. It is called
	 *            Class memory. All static members are loaded into this class
	 *            memory. There is only one static member in MainClass – main()
	 *            method. It is loaded into class memory of MainClass.
	 */

	public static void main(String[] args) {
		// Static Members directly accessed with Class Name
		System.out.println("Start Main method");
		StaticComponents.staticVariable = 20;
		StaticComponents.staticMethod();

		System.out.println("Start Main method");

	}
}
