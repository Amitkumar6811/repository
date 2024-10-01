package com.package1;

public class ThreadEx4 extends Thread
  {
     public void run()
     {
    	 String name=Thread.currentThread().getName();
    	 int priority= Thread.currentThread().getPriority();
    	 for(int i=1;i<=5;i++)
    	 {
    		 System.out.println(name+"("+priority+")"+"has executed run: "+i);
    	 }
     }
     public static void main(String[] args) 
     {
		ThreadEx4 obj=new ThreadEx4();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
  }
