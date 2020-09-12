/**
 * 
 */
package com.cv.logic;


/**
 * @author channaveer.p
 *
 */
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "           Channaveer                     ";
		
		if(!s.trim().isEmpty()) {
			System.out.println("Not empty:" +s.trim());
		}else {
			System.out.println("Empty:" +s);
		}
		
		
		String [] s1 = {"ChannaveerArray"};
		
		System.out.println(s1[0]);
		
	}
	
	 static public boolean isEmpty(String s) {
	        return ((s == null) || s.trim().equals(""));
	    }

}
