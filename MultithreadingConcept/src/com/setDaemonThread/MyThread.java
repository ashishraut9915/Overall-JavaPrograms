package com.setDaemonThread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Hello World..!");
		}
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.setDaemon(true);
		
		MyThread t1 = new MyThread();
		
		t1.start();
		thread.start();
		
		System.out.println("Main Done");
	}

}
