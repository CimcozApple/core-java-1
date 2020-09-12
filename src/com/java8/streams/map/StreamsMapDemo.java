package com.java8.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Pankaj", "amit", "DAVID");

		
		List<String> upperCaseNames = new ArrayList<String>();
		
		for (String n : names) {
			upperCaseNames.add(n.toUpperCase());
		}
		System.out.println(upperCaseNames);

		// Using Streams 
		
		upperCaseNames = names.stream().map(t -> t.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNames);
		
		// Another way of doing it.
		
		upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseNames);
		
 
	}
}
