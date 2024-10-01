package com.package1;

public class DeadLockEx1 
{
	public static void main(String[] args) 
	{
		final String A="Java";
		final String B="python";
		
		Thread t1=new Thread()
				{
			public void run()
			{
				synchronized(A)
				{
					System.out.println("Thread 1 lock on A");
				 try {
					 Thread.sleep(1000);
				 } catch(Exception e)
				 {
					 e.printStackTrace();
				 }
				}
				synchronized(B)
				{
					System.out.println("Thread 1 locked on B");
				}
				System.out.println("no deadlock");
			}
		};
		
		Thread t2=new Thread()
				{
			public void run()
			{
				synchronized(B)
				{
					System.out.println("Thread 2 locked on B");
					try {
						Thread.sleep(1000);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
				};
				
				t1.start();
				t2.start();
	}
}