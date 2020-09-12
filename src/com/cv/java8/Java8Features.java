package com.cv.java8;

import java.util.Arrays;

public class Java8Features {

	public static void main(String[] args) {

		System.out.println("JAva 8 features");
		
		Arrays.asList("a","b","c").forEach(e -> System.out.println(e +"\n"));
		
		Arrays.asList("a", "b", "c").forEach(e -> {System.out.println(e);});

		String seperator = ",";
		
		Arrays.asList("a", "b", "c").forEach(e -> {System.out.println("Seperator:" + e + seperator );});

		
	}

}
