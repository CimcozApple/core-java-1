package com.java8.streams.filter;

import java.util.Arrays;
import java.util.List;

public class StreamFilterDemo {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("spring", "node", "angular", "express");
		
		/*for (String name : langs) {
			if(!name.equalsIgnoreCase("spring")) {
				System.out.println(name);
			}
		}*/
		
		langs.stream()
				.filter(x->!x.equalsIgnoreCase("spring"))
				.forEach(z-> System.out.println(z));
	
		
		// System.out.println(filteredNames);
	}
	

}
