package com.cv.logic;

public class SeperateZeros {

	/**
	 * 
	 * Given an integer array, you have to separate all zero elements from non-zero elements. You have to move zeros either to 
	 * end of the array or bring them to beginning of the array. For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, 
	 * then moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0} and bringing zeros to front will 
	 * result {0, 0, 0, 14, 5, 2, 3}. 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int [] numbers = {2, 3, 0, 5, 0, 4, 0, 3};
		int [] nonzeros = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]== 0 ){
				nonzeros[i] = numbers[i];
				System.out.println(nonzeros[i]);
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]!= 0 ){
				nonzeros[i] = numbers[i];
				System.out.println(nonzeros[i]);
			}
		}
		
	}
}
