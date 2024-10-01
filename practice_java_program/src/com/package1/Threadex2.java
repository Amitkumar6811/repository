package com.package1;

public class Threadex2 extends Thread
 {
    public void run()
    {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("Run method executed: "+i);
    	}
    }
   
 }
