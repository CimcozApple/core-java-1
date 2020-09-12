/**
 * 
 */
package com.cv.memorymanagement;

/**
 * @author channaveer.p
 *
 */

class A {

	int i = 50;

	protected void finilize() throws Throwable {

		System.out.println("From finilize method");
	}
}

public class JavaGarbageCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A a1 = new A();

		A a2 = new A();

		a1 = a2;

		// Now both a1 and a2 will be pointing to same object

		// An object earlier referred by a1 will become abandoned

		// Step 1, Making finalize() method to execute forcefully
		// Runtime.getRuntime().runFinalization() makes the just best effort to
		// execute finalize() method. It is not gauranteed that it will execute
		// finalize() method.
		Runtime.getRuntime().runFinalization();

		System.out.println("done");

	}

}
