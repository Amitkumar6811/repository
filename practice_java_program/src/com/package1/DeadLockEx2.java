package com.package1;

public class DeadLockEx2 
 {
   public static void main(String[] args) 
   {
	 final String A="java";
	 final String B="Python";
	 
	 Thread t1=new Thread()
			 {
			public void run()
			{
		       synchronized(B)
		       {
		    	   System.out.println("Thread1 lock on B");
		    	   try {
		    		   Thread.sleep(3000);
		    	   }
		    	   catch(Exception e)
		    	   {
		    		   e.printStackTrace();
		    	   }
		       }
		       
		       synchronized(A)
		       {
		    	   System.out.println("Thread1 locked on A");
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
				  System.out.println("Thread B locked on B");
				  try {
					  Thread.sleep(3000);
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
