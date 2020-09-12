package com.cv.displaypattern;

public class FiveStar {

	public static void main(String[] args) {
		int n = 5	;

		int m = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("* ");
			}
			System.out.println("\t");
			m++;
		}
	}
}
