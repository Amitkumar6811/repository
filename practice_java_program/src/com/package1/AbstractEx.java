package com.package1;

public abstract class AbstractEx 
  {
      abstract void meth1();
      abstract String meth1(String s);
      
      void meth2()
      {
    	  System.out.println("method2 called...");
      }
      static void meth3()
      {
    	  System.out.println("static method");
      }
       AbstractEx(int a)
       {
    	   System.out.println("i am constractor from parent class"+a);
    	   
       }
      public static void main(String[] args) 
      {
    	 // AbstractEx obj=new AbstractEx();
    	 // obj.meth1();
    	  System.out.println("abstract class main called...");
	} 
      
  }
