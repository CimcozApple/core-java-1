package com.cv.thread.consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> q) {
		this.queue=q;
	}

	@Override
	public void run() {
		
		Message msg;
		try {
			
			while(queue.size() > -1 ){
				
				msg = queue.take();
				System.out.println("Consumed :"+msg.getMsg());
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
		 
		
		
		
	}

}
