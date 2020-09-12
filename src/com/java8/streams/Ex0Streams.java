package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 


class MyPredicate implements Predicate<String>{

	@Override
	public boolean test(String arg0) {
		return !arg0.equals("abc") && arg0 != null;
	}
	
}

public class Ex0Streams {
public static void main(String[] args) {
	
	List<String> collection = Arrays.asList("abc","def",null);
	
	Stream<String> stream = collection.stream();
	
	MyPredicate myP = new MyPredicate();
	
	Stream<String> s = stream.filter(myP);
	
	List<String> l =   s.collect(Collectors.toList());
	System.out.println(l);
	
	/*Consumer<String> consumer = new Consumer<String>() {
		
		@Override
		public void accept(String arg0) {
			System.out.println(arg0);
			
		}
	};
	*/
	// l.forEach(data -> System.out.println(data));
	
	// collection.forEach(consumer);
	
	
	
	}
}
