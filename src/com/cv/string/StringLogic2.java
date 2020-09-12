package com.cv.string;

public class StringLogic2 {
 
	public static void shiftClockWise(int [] a, int shift, int size){
		int temp;
		for (int i = 4; i >0 ; i--) {
			temp = a[i];
			a[i] = a[i-1];
			a[i-1] = temp;
		}
	}
	
	public static void main(String[] args) {

	//int s = 12 & 12;
	
	// int y = 11^6;
	
	// System.out.println(s);
	
		int a [] = {1,2,3,4,5};
		int shift = 2;
 		for (int i = 0; i < shift; i++) {
 			 shiftClockWise(a, shift, a.length);
		}	
		 
		 for(int p : a)
		 System.out.print(p);
		 
//		 for (int i = 5; i > 0; i--) {
//			System.out.println("-"+i);
//		}
//	
//	String s1 = "abc";
//	String s2 = new String("abc");
//	
//	System.out.println(s1 == s2);
	
	
		
	}

}
