package com.package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStrEx1 
  {
    void operation1() throws Exception
    {
    	System.out.println("Reading the from file...");
    	FileInputStream fis=new FileInputStream("D:\\amit kumar\\file\\A.txt");
    	System.out.println("connection created...");
    	int i;
    	while((i=fis.read())!=-1)
    	{
    	   System.out.print((char)i);	
    	}
    	System.out.println();
    	System.out.println("data reterived...");
    	fis.close();
    }
    void operation2() throws Exception
    {
    	System.out.println("Writing data into a file");
    	FileOutputStream fos=new FileOutputStream("D:\\amit kumar\\file\\A.txt");
    	System.out.println("connection created...");
    	String data=", So I love it";
    	byte arr[]=data.getBytes();
    	fos.write(arr);
    	System.out.println("data written...");
    	fos.close();
    }
    void operation3() throws Exception
    {
    System.out.println("Copying the data from one file into another file");
    FileInputStream fis=new FileInputStream("D:\\amit kumar\\file\\pic1.jpg");
    FileOutputStream fos=new FileOutputStream("D:\\amit kumar\\file\\pic2.jpg");
    System.out.println("connection created...");
    int i;
    while((i=fis.read())!=-1)
    {
    	fos.write(i);
    }
    System.out.println("data written...");
    fis.close();
    fos.close();
    }
    
    
    public static void main(String[] args) throws Exception
    {
    	ByteStrEx1 obj=new ByteStrEx1();
    	//obj.operation1();
    	//obj.operation2();
    	obj.operation3();
    	
	}
  }
