package com.PriorityThread;

public class MyThread extends Thread {
	MyThread(String name)
	{
		super(name);
	}

	@Override
	public void run()
	{
		System.out.println("Thread is Running....");
		for(int i = 0; i<=5 ; i++)
		{
			for(int j = 0; j< 5; j++)
			{
				System.out.println(Thread.currentThread().getName()+ " -Priority"+ Thread.currentThread().getPriority()+" count: "+ i);
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args)throws InterruptedException {
		
		MyThread thread1 = new MyThread("Low Priority Thread");
		MyThread thread2 = new MyThread("Medium Priority Thread");
		MyThread thread3 = new MyThread("High Priority Thread");
		
		thread1.setPriority(Thread.NORM_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		

	}
}
