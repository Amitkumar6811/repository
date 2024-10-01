package com.package1;

public class InterThreadCommEx2Driven 
  {
   public static void main(String[] args) 
   {
	   InterThreadCommEx2 obj=new InterThreadCommEx2();
	    
	   new Thread()  //Anonymous class
	   {
		   public void run()
		   {
			  try {
				  obj.with_draw(15000);
			  }catch(Exception e)
			  {
				  e.printStackTrace();
			  }
		   }
	   }
	   .start();
	   
	 new Thread()
	 {
		 public void run()
		 {
			 obj.deposit(10000);
		 }
	 }
	 .start(); 
  }
  }
