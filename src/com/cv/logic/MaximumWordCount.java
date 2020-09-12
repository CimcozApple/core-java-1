package com.cv.logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumWordCount {

	public static void main(String[] args) {
		
	HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
	BufferedReader reader = null;
	
	try {
		reader = new BufferedReader(new FileReader("D:\\channaveer\\projects\\testjava.txt"));
		String currentline = reader.readLine();
		while(currentline!=null){
				// System.out.println(currentline.toString());
			
			String[] words = currentline.toLowerCase().split(" ");
			
			for(String word: words){
				// System.out.println(word);
				
				if(wordCountMap.containsKey(word)){
					wordCountMap.put(word, wordCountMap.get(word)+1);
				}else{
					wordCountMap.put(word, 1);
				}
			}
			
			currentline = reader.readLine();
		}
		
		// System.out.println(wordCountMap);
		Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
		int count = 0;
		String value = null ;
		for(Entry<String, Integer> entry : entrySet){
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
			if(entry.getValue() > count){
				value = entry.getKey();
				count = entry.getValue();
			}
			
		}
		System.out.println("Maximum word repeated that is '" + value + "' " +" and the count is "+ count +" times");
		
		
		
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (IOException e) {
		e.printStackTrace();
	}

	}
	
	
	
}
