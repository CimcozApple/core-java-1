package com.java8.streams.listToMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapDemo {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "John", "smith"));
		list.add(new Person(2, "Tim", "Cook"));
		list.add(new Person(3, "Harry", "Potter"));
		list.add(new Person(4, "Will", "smith"));
		list.add(new Person(5, "John", "sena"));
		
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> newmap = new HashMap<>();
 		List<Map<String, Object>> lmap = new ArrayList<>();
		
		map.put("REBILL", "Project");
		
		lmap.add(map);
		
		System.out.println("lmap" + lmap);
		
		// newmap = lmap.stream().collect(Collectors.toMap(lmap.get(0).keySet(), lmap.get(0).values());
		

		System.out.println("/* ----------------------------------------------------------- */" );

		for (Person person : list) {
			System.out.println(person.getName());
		}

		System.out.println("/* ----------------------------------------------------------- */" );


		list.stream().forEach(x-> {
			System.out.println(x.getName());
		});

		System.out.println("/* ------------------------List to Map----------------------------------- */" );

		Map<Integer, String> personMap = list.stream()
				.collect(Collectors.toMap(Person::getId, Person::getName));
		System.out.println(personMap);

		System.out.println("/* --------------------------Map Internal Iteration--------------------------------- */" );

		personMap.entrySet().stream().forEach(x->{
			System.out.println(x.getKey() +"="+ x.getValue());
		});

		System.out.println("/* -------------------------Map Filter---------------------------------- */" );

		Map<Integer, String > anotherMap = personMap.entrySet()
				.stream()
				.filter(x-> !x.getKey().toString().equals("2"))
				.collect(Collectors.toMap(y->y.getKey(), y->y.getValue()));

		System.out.println("Filtered Map: " + anotherMap);


	}



}
