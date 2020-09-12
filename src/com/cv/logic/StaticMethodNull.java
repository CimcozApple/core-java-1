package com.cv.logic;

class A{
	
	static void m1(){
		System.out.println("In m1");
	}
}

public class StaticMethodNull {

	
	public static void main(String[] args) {
		
		A a = null; // Catch point
		a.m1();
		
		Integer i1 = 129;
		
		Integer i2 = 129;
		
		System.out.println(i1 == i2);
		
	}
}
