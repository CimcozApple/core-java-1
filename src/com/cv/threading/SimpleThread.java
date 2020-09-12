package com.cv.threading;

public class SimpleThread extends Thread {

	public void run() {
		System.out.println("Tread is running .. ");
		
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(" Time: " + i); 
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Tread is Stoping.. ");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method start");
		
		SimpleThread t1 = new SimpleThread();
		t1.start();
		
		System.out.println("Main method end");
	}

}
