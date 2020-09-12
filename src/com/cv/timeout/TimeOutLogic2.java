package com.cv.timeout;

import java.util.Date;

public class TimeOutLogic2 {

	public static void main(String[] args) {
 
	        Thread t1 = new Thread(){
	            public void run(){
	                System.out.println(new Date());
	                try {
	                	System.out.println("Helloooo....... sent email() ");
	                    Thread.sleep(3000); // sleep for 10 seconds. - Need to call mail method 
	                } catch (InterruptedException e) {
	                    System.out.println("Sleep interrupted");
	                }
	                System.out.println(new Date());
	            }
	        };

	        t1.start();
	        try {
	            Thread.sleep(3500); // sleep for 2 seconds.
	        } catch (InterruptedException e) {
	            e.printStackTrace();  
	        }
	        t1.interrupt();
	    }
		
}
