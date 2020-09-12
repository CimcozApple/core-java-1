package com.cv.garabagetest;

public class GarbageTestDemo {

	public static void main(String[] args) {

		GarbageTestDemo test1 = new GarbageTestDemo();
		GarbageTestDemo test2 = new GarbageTestDemo();
		
		test1 = null;
		System.gc();
		
		test2 = null;
		Runtime.getRuntime().gc();
		
	}
	
	@Override
	protected void finalize() throws Throwable {
	 	System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
//        super.finalize();
	}
}
