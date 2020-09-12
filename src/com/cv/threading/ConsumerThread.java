package com.cv.threading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

 
 
public class ConsumerThread {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> queue = new LinkedBlockingQueue<>();
		Map<String, String> hmQueue = new HashMap<>();

		if (hmQueue.get("test") == null) {
			System.out.println("Putting data to queue");

 			hmQueue.put("test", "test");
 			queue.put("blockQueue");
		} else {
			System.out.println("Already exists");
		}
		
		System.out.println("Entering Main Method");
		Thread t = new Thread(new Consumer(" Thread consumer Data"));
		t.setName("My Thread");
		t.setDaemon(false);
		t.start();
		
		try {
            Thread.sleep(3000);
        } catch (InterruptedException x) {

        }
		
		System.out.println("Exiting Main Method");
	}
}

class Consumer implements Runnable {

	   Consumer( String tData) {
		  System.out.println("Constructor Data : " +tData );
	   }
	   /**
	    * fetch the job from the queue and execute it
	    */
	   int count = 0;
	   public void run() {
	     while(true)  {
	    		System.out.println("In run method and Thread name : " + Thread.currentThread() +" "  + count++);
	    		System.out.println(Thread.currentThread().isAlive());
	    		try {
					Thread.currentThread();
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       }

	   }
	}