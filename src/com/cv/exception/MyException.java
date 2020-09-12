package com.cv.exception;

public class MyException extends Exception {

	private String ex ;
	
	public MyException(String s) {
		ex = s;
		System.out.println("My Exception");
	}
	
//	public String toString(){
//		return "My Exception from Userdefine class: " +ex;
//		
//	}
}
