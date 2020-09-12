package com.cv.threading;

public class DaemonThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main method Enter");
		
		DaemonThread thread = new DaemonThread();
		thread.setDaemon(false);
		thread.setName("MyTread **** ");
		//Thread thread = new Thread();
		// When false, (i.e. when it's a user thread), the Worker thread
		// continues to run.
		// When true, (i.e. when it's a daemon thread), the Worker thread
		// terminates when the main thread terminates.
		thread.start();
		System.out.println("Main method Exit");
	}
	
	public void run() {
		System.out.println("run Method Entry");
 
		try {
			System.out.println("In run Method: currentThread() is"
					+ Thread.currentThread());
 
			while (true) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException x) {
				}
 
				System.out.println("In run method.." + Thread.currentThread());
			}
		} finally {
			System.out.println("run Method Exit");
		}
	}

	
}
