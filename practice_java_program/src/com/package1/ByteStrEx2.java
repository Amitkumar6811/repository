package com.package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ByteStrEx2 
   {
   void operation1() throws Exception
   {
	   System.out.println("Reading data from file");
	   FileInputStream fis=new FileInputStream("D:\\amit kumar\\file\\A.txt");
	   System.out.println("Please wait...");
	   Thread.sleep(1000);
	   System.out.println("connection created");
	   int i;
	   System.out.println("Wait data is reteriving...");
	   Thread.sleep(1000);
	   while((i=fis.read())!=-1)
	 {
		System.out.print((char)i);   
	 }
	   System.out.println();
	   System.out.println("data reterived");
	   fis.close();
   }
   void operation2() throws Exception
   {
	   Scanner scr=new Scanner(System.in);
	   System.out.println("Writing data into file");
	   FileOutputStream fos=new FileOutputStream("D:\\amit kumar\\file\\A.txt");
	   System.out.println("Please wait...");
	   Thread.sleep(1000);
	   System.out.println("Connection created");
	   System.out.println("Please enter data to store into file");
	   String data="java is awesome...";
	   System.out.println("Wait data is writing...");
	   Thread.sleep(3000);
	   byte arr[]=data.getBytes();
	   fos.write(arr);
	   System.out.println("Data written successfully"); 
	   scr.close();
	   fos.close();
   }
   void operation3() throws Exception
   {
	 System.out.println("Copying data from one file into another file...");
	 FileInputStream fis=new FileInputStream("D:\\amit kumar\\file\\pic1.jpg");
	 FileOutputStream fos=new FileOutputStream("D:\\amit kumar\\file\\pic3.jpg");
	 System.out.println("Please wait...");
	 Thread.sleep(3000);
	 System.out.println("connection created...");
	 int i;
	 while((i=fis.read())!=-1)
	 {
		 fos.write(i);
	 }
	 System.out.println("file succesfully copying...");
   }
    public static void main(String[] args) throws Exception
    {
    	ByteStrEx2 obj=new ByteStrEx2();
    	 //obj.operation1();
    	//obj.operation2();
       //obj.interupt();
    	obj.operation3();
	}
   }
