package com.cv.thread.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerService {

	public static void main(String[] args) {
		
		BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
		
		Producer prod = new Producer(queue);
		Consumer con = new Consumer(queue);
		
		new Thread(prod).start();
		new Thread(con).start();
		
		System.out.println("Producer Consumer started");

	}

}
