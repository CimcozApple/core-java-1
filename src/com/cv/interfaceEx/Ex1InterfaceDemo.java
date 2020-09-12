package com.cv.interfaceEx;

import java.util.List;

interface A {
	
	/**
	 * private variables not allowed only public, static & final are permitted
	 */
	// private int i;
	
	void m1();
	
 }

class B implements A {
	
	void m2() {
		System.out.println("m2");
	}

 	public void m1() {
 		System.out.println("m1");
	}
}

public class Ex1InterfaceDemo {
	public static void main(String[] args) {
		A a = new B() ;
		
		//a.m2();
		
	}
}
