package com.package1;

public class ThreadEx extends Thread 
   {
       public void run()
       {
    	   for(int i=0;i<5;i++)
    	   {
    		   System.out.println("Run method executed.. "+i);
    	   }
       }
       public static void main(String[] args) 
       {
		 ThreadEx aobj=new ThreadEx();
		 Thread t1=new Thread(aobj);
		 t1.start();
   	}
  }
