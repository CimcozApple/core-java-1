/**
 * 
 */
package com.cv.memorymanagement;

/**
 * @author channaveer.p
 *
 */
public class HowStringAreStoredInMemoryDemo {

	/**
	 * @param args
	 * 
	 *            We all know that JVM divides the allocated memory to a Java
	 *            program into two parts. one is Stack and another one is heap.
	 * 
	 *            Stack is used for execution purpose and heap is used for
	 *            storage purpose.
	 * 
	 *            In that heap memory, JVM allocates some memory specially meant
	 *            for string literals. This part of the heap memory is called
	 *            String Constant Pool.
	 * 
	 */
	public static void main(String[] args) {

		// Creating String objects using literals

		String s1 = "abc";

		String s2 = "abc";

		System.out.println(s1 == s2); // output : true

		// Creating string objects using new operator

		String s3 = new String("abc");

		String s4 = new String("abc");

		System.out.println(s3 == s4); // output : false

	}

}
