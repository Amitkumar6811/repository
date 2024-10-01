package com.package1;

public class InterThreadCommEx2 
	{
	int amount=10000;
	synchronized void with_draw(int amount) throws InterruptedException
	{
		if(this.amount<amount)
			
		{
			System.out.println("Insufficient Balance");
			wait(3000,200);
			System.out.println("amount credited...");
			this.amount-=amount;
			System.out.println("Withdraw successfull\nBalance is: "+this.amount);	
		}
		else
		{
			this.amount=amount;
			System.out.println("Deposited successful\nBalance is: "+this.amount);
		}
	}
	
	synchronized void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("Deposited successful\nBalance is: "+this.amount);
		//notify();
		//notifyAll();
	}
	}
