package com.package1;

public class ThreadEx5 
  {
    public static void main(String[] args) throws InterruptedException 
    {
    	Threadex2 obj=new Threadex2();
    	obj.start();
    	obj.join();
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("classB main executed "+i);
    	}
    	
	}
  }
