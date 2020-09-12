package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Ex1StreamDemo {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8);
		
		/*for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}*/
		
		/*Iterator<Integer> i = l.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		
		/*for (Integer i : l) {
			System.out.println(i);
		}*/
		
		l.forEach(i -> {System.out.println("data: "+i);});
	}

}
