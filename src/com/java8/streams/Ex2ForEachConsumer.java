package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex2ForEachConsumer {
public static void main(String[] args) {
	List<String> collection = Arrays.asList("abc","def","ghi");
 
	Consumer<String> consumer = new Consumer<String>() {
		
		@Override
		public void accept(String arg0) {
			System.out.println(" 1"+arg0);
			
		}
	};
	
	// l.forEach(data -> System.out.println(data));
	/**
	 * class Ex2ForEachConsumer$n1 implements Consumer<T> {
     			public void accept(String arg0) {
         		System.out.println(arg0);
     		}
		}
	 * 
	 */
	
	collection.forEach(consumer);
	
}
}
