package com.cv.logic;

public class TwoDArray {

	public static void main(String[] args) {

		
		int [] firstElement = {1, 2};
		int [] secondElement = {4, 5};
		
		int [] [] twoDimensionalArray = {firstElement, secondElement};
		
		for(int i=0; i<twoDimensionalArray.length; i++ ){
			System.out.print("{");
			for (int j=0; j<twoDimensionalArray[i].length; j++){
				System.out.print(twoDimensionalArray[i][j]+",");
			}
			System.out.print("}");
			System.out.print("\n");
			
		}
	}

}
