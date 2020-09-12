package com.cv.inheritance;

class A {
	int i;

	void method1() {
		System.out.println("Method1");
	}
}

class B extends A {
	int j;

	void method2() {
		System.out.println("Method 2");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {

		A a = new B();
		a.method1();
	}

}
