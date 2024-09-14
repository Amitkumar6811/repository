package com.package1;

public class Constructor2 
  {
   public Constructor2()
   {
	   System.out.println("sunday");
	   Constructor2 obj=new Constructor2(10);
	   System.out.println("Tuesday");
	   String s=obj.display("Challenge accepted");
	   System.out.println(s);
   }
   
   public Constructor2(int temp)
   {
	   System.out.println("Saturday");
	   new Constructor2(10,20);
	   System.out.println("monday");
   }
   
   String display(String s)
   {
	   System.out.println("in the next statement i am returing string values");
	   return s;
   }
   public Constructor2(int data,int temp)
   {
	   System.out.println("Thuesday");
   }
   public static void main(String[] args) 
   {
	Constructor2 obj=new Constructor2();
	   System.out.println("output verified");
			
  }
  }
