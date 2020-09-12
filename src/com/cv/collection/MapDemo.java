package com.cv.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "Hello");
		m.put(2, "World");
		
		System.out.println(m);
		
		for (Entry<Integer, String> e : m.entrySet()) {
			System.out.println("Keys: " + e.getKey() + " Values : " + e.getValue());
			
		}
		
	}
}
