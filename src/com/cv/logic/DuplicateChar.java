package com.cv.logic;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String input = "banana";
		char search = 'a';
		String searchString = "a";
		char data[] = input.toCharArray();
		
		int countme = 0;
		
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length(); j++) {
				
				//System.out.println(input.charAt(i)+""+input.charAt(j));
				}
			
		}
		
		System.out.println(countme);
		
		
		
		
		
		
		
		
		
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if(i<input.length()-(searchString.length()-1)){
				if(input.substring(i, i+searchString.length()).equalsIgnoreCase(searchString)){
					count++;
				}
			}
		}
		System.out.println(searchString + " Repeated: "+count+" times");
		
		
		
		
		int counter = 0;
		for(char c: data){
			if(search == c){
				counter++;
			}
		}		
		 System.out.println(counter);
		
	}

}
