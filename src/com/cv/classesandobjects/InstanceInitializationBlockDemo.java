package com.cv.classesandobjects;

/**
 * 
 * @author channaveer.p
 * 
 *         IIB - Instance Initialization Block
 */

class A {
	int i = 10;
	// IIB - Instance Initialization Block
	{
		i = 20;
		System.out.println("i value at IIB block:" + i);
	}

	A(int j) {
		i = j;
	}
}

public class InstanceInitializationBlockDemo {

	public static void main(String[] args) {

		A a = new A(30);

		System.out.println(a.i);
	}

}
