/**
 * 
 */
package com.cv.inheritance;

/**
 * @author channaveer.p
 *
 */

class AA {
	static int i = 10;

	static void m1() {
		System.out.println("m1 & i value: " + i);
	}
}

class BB extends AA {

	static int j = 20;
}

public class StaticMemberInheritanceToSubClass {

	public static void main(String[] args) {

		BB.m1();
		System.out.println(BB.i);
	}

}
