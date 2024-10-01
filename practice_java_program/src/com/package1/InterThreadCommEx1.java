package com.package1;

public class InterThreadCommEx1 
  {
   int amount=10000;
   
   synchronized void with_draw(int amount) throws InterruptedException
   {
	   if(this.amount<amount)
	   {
		   System.out.println("Insufficient Balance");
		   wait(1000,500);
		   System.out.println("amount creadited");
		   this.amount-=amount;
		   System.out.println("withdraw successful\nBalance is "+this.amount);
	   }
	   else
	   {
		   this.amount=amount;
		   System.out.println("Deposited Successful\nBalance is "+this.amount);
		   
	   }
   }
   
   synchronized void deposit(int amount)
   {
	  this.amount+=amount;
	  System.out.println("Deposited successfully\nBalance is "+this.amount);
	  //notify();
	  // notifyAll();
   }
   
  }
