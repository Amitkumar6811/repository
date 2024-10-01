package com.package1;

public class Synchroex1 extends Thread
  {
   public void run()
   {
	   Criticalrecource();
   }
   
   synchronized void Criticalrecource()
   {
	    String name=Thread.currentThread().getName();
	     System.out.println(name+" has entered critical resource: ");
	     
	     for(int i=0;i<5;i++)
	     {
	    	 System.out.println(name+" i value: "+i);
	     }
	     System.out.println(name+" cpmpleted its execution: ");
   }
   
   public static void main(String[] args) throws InterruptedException
   {
	 Synchroex1 obj=new Synchroex1();
	 Thread t1=new Thread(obj);
	 Thread t2=new Thread(obj);
	 
	 t1.setName("First Thread...");
	 t2.setName("Second Thread...");
	
	 t1.start(); 
	 t2.start();
 }
  }
