package com.corejava.deadlocksample;

public class DeadLockSample {
	public static void main(String[] args) {
		final String resource1 = "abcd";
		final String resource2 = "defg";

		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread1 Running");
				synchronized (resource1) {
					System.out.println("Thread1 : locked resource 1");
					
					try {
					//	Thread.sleep(100);
					} catch (Exception e) {

					}
					
					synchronized (resource2) {
						System.out.println("Thread1 : locked resource 2");
					}

				}

			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread2 Running");
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");
					
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
					
					
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
