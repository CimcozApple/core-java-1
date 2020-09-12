package com.cv.keywords;

public class AssertDemo {

	public static void main(String[] args) {
		int value = 15; 
        assert value >= 20 : " Underweight"; 
        System.out.println("value is "+value); 
        
        String s = "s";
        
        s.concat("s");
	}
}
