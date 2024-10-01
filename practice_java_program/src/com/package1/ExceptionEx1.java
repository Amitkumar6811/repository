package com.package1;

import java.util.Scanner;

public class ExceptionEx1 
  {
   void meth1()
   {
	   Scanner scr=new Scanner(System.in);
	   System.out.println(20);
	   try
	   {
		   System.out.println("try block executed...");
		   System.out.println("please enter a number: ");
		   System.out.println("=====> "+20/scr.nextInt());
	   }
	   catch(ArithmeticException e)
	   {
		  e.printStackTrace(); 
	   }
	   finally
	   {
		   System.out.println("finally block executed..");
		   scr.close();
	   }
   }
   // method 2
   
   void meth2()
   {
	   try
	   {
		   System.out.println("try block executed...");
		   System.out.println(20/0);
	   }catch(Exception e)
	   {
		   System.out.println("catch block executed..");
		   System.out.println(e.getMessage());
		   System.out.println(e.toString());
		 //  e.printStackTrace();
	   }
   }
   
   public static void main(String[] args)
   {
	  ExceptionEx1 obj=new ExceptionEx1();
	  //obj.meth1();
	  obj.meth2();
   }
  }
