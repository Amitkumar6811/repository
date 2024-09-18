package com.package1;

// Compile time polymorphism - Method overloading

public class MethodOveridingExp 
  {
    private void meth1()
    {
    	System.out.println("I am private method...");
    }
    static void meth1(int a)
    {
    	
    	System.out.println("I am static method with one parameter");
    	System.out.println(a);
    }
    final static int meth1(int a,int b)
    {
    	System.out.println("I am final method....");
    	return a;
    }
    protected String meth1(int a,String s,char c)
    {
    	System.out.println("I am String meth1 with 3 parameter");
    	return "";
    }
     public static void main(int C)
       {
    	  System.out.println("I am clone main method"); 
       }
     MethodOveridingExp(int a)
     {
    	 System.out.println("default constructor00");
    	 
     }
     MethodOveridingExp(int c,int b)
     {
    	 this(10);
    	 System.out.println(b);
     }
     public static void main(String[] args)
     {
		 System.out.println(" I am main method///");
		 MethodOveridingExp aobj=new MethodOveridingExp(10,20);
		 aobj.meth1();
		 meth1(300);
		 meth1(93,49);
		 
	}
  }
