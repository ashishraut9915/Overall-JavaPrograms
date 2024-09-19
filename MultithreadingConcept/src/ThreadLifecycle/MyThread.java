package ThreadLifecycle;

public class MyThread extends Thread {
	
	public void run() {
		
		System.out.println("Running");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		System.out.println(thread.getState());//New     Create new thread
		
		thread.start();
		System.out.println(thread.getState());// Runnable 
		
		Thread.sleep(100);
		System.out.println(thread.getState());// Time Waited / Blocked
		
		thread.join();
		System.out.println(thread.getState());// Terminated
		
	}

}
