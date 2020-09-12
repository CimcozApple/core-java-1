package com.cv.logic;

public class SumOfArray {

	/**
	 * 
	 * Problem :

		Given an array of integers, you have to find all pairs of elements in this array such that 
		whose sum must be equal to a given number.

		For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all 
		pairs of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs 
		whose sum is 20.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] numbers = {1, 2, 3, 4, 3, 4, 5, 3};
		
		int givenNo = 6;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				int m = numbers[i];
				int n = numbers[j];
				
 				if(m + n == givenNo){
					System.out.println("Pairs are :{" + m +"," +n +"}" );
				}
			}
			
		}
		
		
	}
}
