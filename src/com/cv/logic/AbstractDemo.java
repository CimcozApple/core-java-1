package com.cv.logic;

	abstract class ALK implements InterfaceA {
		
		public void m1(){
			System.out.println("In M1");
		}
		
		void m2(){
			System.out.println("In M2");
		}
		
	}
	
	
 
public class AbstractDemo extends ALK{

	public static void main(String[] args) {
 
			AbstractDemo abstractDem = new AbstractDemo();
			abstractDem.m1();
			
	}

	@Override
	public void mm11() {
		// TODO Auto-generated method stub
		
	}

}
