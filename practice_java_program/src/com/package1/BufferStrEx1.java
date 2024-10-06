package com.package1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferStrEx1 
   {
     void operation1() throws Exception
     {
    	 System.out.println("Reading the data by using buffered Stream");
    	 BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\amit kumar\\file\\A.txt"));
    	 System.out.println("Please wait...");
    	 Thread.sleep(1000);
    	 System.out.println("connection created");
    	 int i;
    	 while((i=bis.read())!=-1)
    	 { 
    		 System.out.print((char)i);
    	 }
    	 System.out.println();
    	 System.out.println("data reterived");
    	 bis.close();
     }
     void operation2() throws Exception
     {
    	 System.out.println("Writing data using buffered stream");
    	 BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\amit kumar\\file\\A.txt"));
    	 System.out.println("Please wait...");
    	 Thread.sleep(1000);
    	 System.out.println("connection created");
    	 String data="Welcome to java...";
    	 byte arr[]=data.getBytes();
    	 bos.write(arr);
    	 System.out.println("data Writen sucessfully");
    	 bos.close();
     }
     void operation3() throws Exception
     {
    	 System.out.println("copying data by using buffered stream...");
    	 BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\amit kumar\\file\\pic3.jpg"));
    	 BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\amit kumar\\file\\pic4.jpg"));
    	 System.out.println("Please wait...");
    	 Thread.sleep(1000);
    	 System.out.println("connection created");
    	 int i;
    	 while((i=bis.read())!=-1)
    	 {
    		 bos.write(i);
    	 }
    	 System.out.println("data copy");
    	 bis.close();
    	 bos.close();
     }
     void operation4() throws Exception
     {
    	 System.out.println("copying data by using buffered stream...");
    	 BufferedReader br=new BufferedReader(new FileReader("D:\\amit kumar\\file\\pic4.jpg"));
    	 BufferedWriter bos=new BufferedWriter(new FileWriter("D:\\amit kumar\\file\\pic5.jpg"));
    	 System.out.println("Please wait...");
    	 Thread.sleep(1000);
    	 System.out.println("connection created");
    	 int i;
    	 while((i=br.read())!=-1)
    	 {
    		 bos.write(i);
    	 }
    	 System.out.println("data copy");
    	 br.close();
    	 bos.close();
     }
     public static void main(String[] args) throws Exception
     {
		//new BufferStrEx1().operation1();
		//new BufferStrEx1().operation2();
		new BufferStrEx1().operation3();
    	 //new BufferStrEx1().operation4(); 
	}
   }
