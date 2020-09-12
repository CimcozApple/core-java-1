package com.cv.memorymanagement;

/**
 * @author channaveer.p
 *
 *
 *         Whenever you trigger a java command, it divides allocated memory into
 *         two parts – Stack and Heap. Stack is used only for execution purpose.
 *         Heap is used for storage purpose. consider the following program and
 *         we will see how it uses stack and heap memory through diagram.
 */

// Step 1: Java command execution

public class StackAndHeapMemory {

	// Step 2 : Class Memory and method information in Heap memory


	static void method1() {
		System.out.println("In Static Method 1");
		// step 5 : method2 () call
		method2();
	}

	static void method2() {
		System.out.println("In static Method 2");
	}

	// Step 3 : JVM Calls main method and starts it's execution

	public static void main(String[] args) {

		System.out.println("Main method starts:");

		// Step 4: static method call

		method1();

		System.out.println("Main method ends:");

	}

}
