package com.cv.exception;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		int a = 11;

		if (a > 10) {
			try {
				throw new MyException("a is greater than 10");
			} catch (MyException e) {

				System.out.println("Caugt Ex " + e);
			}

		}
	}
}
