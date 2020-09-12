package com.cv.inheritance;


class OuterClass {

	class InnerClassOne {

		int i = 10;

		void methodOfInnerClassOne() {
			System.out.println("InnerClassOne Method:");
		}

	}

	class InnerClassTwo extends InnerClassOne {
		// One inner class can extend another inner class;
	}

}

public class InheritenceOfInnerClasses {

	public static void main(String[] args) {

		OuterClass outerClass = new OuterClass();

		OuterClass.InnerClassTwo innerClassTwo = outerClass.new InnerClassTwo();

		System.out.println(innerClassTwo.i);
		innerClassTwo.methodOfInnerClassOne();

	}

}
