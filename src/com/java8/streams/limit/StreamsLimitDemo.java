package com.java8.streams.limit;

import java.util.Random;

public class StreamsLimitDemo {

	public static void main(String[] args) {
		Random random = new Random();
		
		// ints => IntStreams
		random.ints()
			.limit(3)
			.sorted()
			.forEach(i -> System.out.println(i));
		
		System.out.println("-----------");
		// Doubles => DoubleStream
		
		random.doubles()
			.limit(2)
			.sorted()
			.forEach(i -> System.out.println(i));
		
		
	}
}
