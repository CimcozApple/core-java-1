package com.cv.string;

import java.nio.charset.Charset;
import java.util.Random;

public class RandomStringDemo {

	public static void main(String[] args) {
		
		byte[] barray = new byte[7];
		
		Object o = new Object();
	 		
		new Random().nextBytes(barray);

		String randomString = new String(barray, Charset.forName("UTF-8"));
		
		System.out.println(randomString);
	}
}
