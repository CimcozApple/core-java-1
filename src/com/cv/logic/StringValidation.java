package com.cv.logic;

public class StringValidation {

	public static void main(String[] args) {

		// String tokens[] = {"AAA3JD9", "AAA3JD9" , "AAA3JD"};
		String tokens[] = {"AAA3JD9", "AAA3JD9" , "AAA3JDd"};

		boolean b = false;
		for (int i = 0; i < tokens.length; i++) {
			if(tokens[i].trim().length() < 7) {
				b = true;
			}
		}
		
		System.out.println(b);
		
	}

}
