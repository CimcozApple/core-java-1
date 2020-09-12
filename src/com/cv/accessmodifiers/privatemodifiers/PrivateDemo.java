package com.cv.accessmodifiers.privatemodifiers;


/**
 * 
 * @author channaveer.p
 *
 */

class A {

	private int i;

	// private method
	private void m1ofA() {

		B b = new B();
	}

	// private inner class
	private class B {

	}

	class C extends A {

		void m2ofC() {

			// System.out.println(i);
			A a = new A();
			// System.out.println(a.i); Private field can not be used outside
			// the class
			// a.methodOfClassA(); Private method can not be used outside the
			// class
			// A.B b = new A.B(); Private inner class can not be used outside
			// the class
		}
	}
}

public class PrivateDemo {
	public static void main(String[] args) {

		// C c = new C();
	}
}
