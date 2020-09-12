package com.cv.timeout;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TimeOutLogic {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
	ExecutorService executor = Executors.newSingleThreadExecutor();
	Future<String> future = executor.submit(new Callable<String>() {

	    public String call() throws Exception {
	        Thread.sleep(3000);
	        return "OK";
	    }
	});

	try {
	    System.out.println(future.get(2, TimeUnit.SECONDS)); //timeout is in 2 seconds
	} catch (TimeoutException e) {
	    System.err.println("Timeout");
	}
	executor.shutdownNow();
	}
}
