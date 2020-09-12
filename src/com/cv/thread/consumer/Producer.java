package com.cv.thread.consumer;

import java.util.Scanner;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/*Producer class that will 
 * create messages 
 * and put it in the queue.*/

public class Producer implements Runnable {
	
	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> q) {
		this.queue=q;	
	}

	@Override
	public void run() {
		System.out.println("Producer.");
		
		//Produce message
		/*for(int i=0; ; i++) {
			Message msg=new Message(" "+i);
			try {
				Thread.sleep(1000);
				queue.put(msg);
				System.out.println("Produced :"+msg.getMsg());
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}*/
		//for(int i=0; ; i++) {
		for(;;) {
			System.out.println("Enter the jobs to execute.");
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			
			for(int i=0; i<n; i++) {
			
			Message msg=new Message(" "+i);
			try {
				Thread.sleep(1000);
				queue.put(msg);
				System.out.println("Produced :"+msg.getMsg());
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
		//Adding exit message
		/*Message msg = new Message("Exit");
		try {
			queue.put(msg);
			System.out.println("Produced :"+msg.getMsg());
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
