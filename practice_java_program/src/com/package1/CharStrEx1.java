package com.package1;

import java.io.FileReader;
import java.io.FileWriter;

public class CharStrEx1 
  {
    void operation1() throws Exception
    {
    	System.out.println("Reading data by using character stream...");
    	FileReader fr=new FileReader("D:\\amit kumar\\file\\A.txt");
    	System.out.println("Please wait");
    	Thread.sleep(1000);
    	System.out.println("Connection created...");
    	int i;
    	while((i=fr.read())!=-1)
    	{
    		System.out.print((char)i);
    	}
    	System.out.println();
    	System.out.println("data read successfully...");
    	fr.close();
    }
    public void operation2() throws Exception
    {
       System.out.println("data writing into file using character stream");
       FileWriter fw=new FileWriter("D:\\amit kumar\\file\\A.txt");
       System.out.println("Please wait");
	   Thread.sleep(1000);
	   System.out.println("Connection created...");
	   String data="I love java...";
	   fw.write(data);
	   System.out.println("data write successfully...");
	   fw.close();
    }
    void operation3() throws Exception
    {
    	System.out.println("data copying data by using character stream");
    	FileReader fr=new FileReader("D:\\amit kumar\\file\\pic3.jpg");
    	FileWriter fw=new FileWriter("D:\\amit kumar\\file\\pic5.jpg");
    	System.out.println("Please wait");
  	    Thread.sleep(1000);
  	    System.out.println("Connection created...");
  	    int i;
  	    while((i=fr.read())!=-1)
  	    {
  	    	fw.write(i);
  	    }
  	    System.out.println("copying successfully...");
    }
    public static void main(String[] args) throws Exception
    {
		//new CharStrEx1().operation1();
		//new CharStrEx1().operation2();
		new CharStrEx1().operation3();
	}
  }
