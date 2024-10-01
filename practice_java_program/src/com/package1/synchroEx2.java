package com.package1;

public class synchroEx2 extends Thread
  {
   public void run()
   {
	   String name=Thread.currentThread().getName();
	   synchronized(this)
	   {
		   System.out.println(name+" has enterd critical resource");
		   for(int i=1;i<=5;i++)
		   {
			   System.out.println(name+" i value: "+i);
		   }	   
	   }
	   System.out.println(name+" has completed its execution");
		   for(int x=10;x<=15;x++)
		   {
			  System.out.println(name+" x value :"+x); 
		   }
	   }
   public static void main(String[] args) 
   {
	   synchroEx2 obj=new synchroEx2();
	   Thread t1=new Thread(obj);
	   Thread t2=new Thread(obj);
	   
	   t1.setName("First Thread");
	   t1.setName("Second Thread");
	   
	   t1.start();
	   t2.start();
   }
   }
