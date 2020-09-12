package com.cv.memorymanagement;

class AA {
	static int i;

	static {
		System.out.println(1);

		i = 100;
	}
}

public class StaticInitializationBlockDemo {
	static {
		System.out.println(2);
	}

	public static void main(String[] args) {
		System.out.println(3);

		System.out.println(AA.i);
	}

}
