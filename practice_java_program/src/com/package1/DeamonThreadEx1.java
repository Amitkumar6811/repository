package com.package1;

public class DeamonThreadEx1 extends Thread 
  {
    public void run()
    {
    	int i=0;
    	while(true)
    	{
    		i=i+1;
    		System.out.println("Deamon :"+i);
    	}
    }
    public static void main(String[] args)
    {
    	DeamonThreadEx1 obj=new DeamonThreadEx1();
    	Thread t=new Thread(obj);
    	t.setDaemon(true);
    	t.start();
    	for(int i=1;i<10;i++)
    	{
    		System.out.println("main: "+i);
    	}
    	System.out.println("end of main");
	}
  }
