package com.cv.logic;

public class SpaceInString {

	public static void main(String[] args) {
		
		String s = " A C A G 1 S X  ";
		
		System.out.println(s.trim());
		System.out.println(s.replaceAll(" ",""));
		System.out.println(s.replaceAll("\\s+", ""));
	}

}
