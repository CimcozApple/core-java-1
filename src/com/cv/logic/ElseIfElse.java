package com.cv.logic;

public class ElseIfElse {

	public static void main(String[] args) {
		int x = 20;

	      if( x == 10 ) {
	         System.out.print("Value of X is 10");
	      }else if( x == 20 ) {
	         System.out.print("Value of X is 20 \n");
	      }else if( x == 30 ) {
	         System.out.print("Value of X is 30");
	      }else {
	         System.out.print("This is else statement \n");
	      }
	      
	      int n = 0;
	      
	      for (int i = 0; i < 5; i++) {
			System.out.println("Final n value :"+n );
			n++;
			if(n%2 == 0) {
				System.out.println("Even :" +n);
				n=0;
			}else{
				System.out.println("Odd :" +n);
				n=1;
			};
			
		}
	}
	
}
