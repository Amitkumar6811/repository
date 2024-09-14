package com.package1;

public class Constructor1 
  {
   Constructor1()
   {
	   System.out.println("I am from non parameterized method.....");
	  
   }
   Constructor1(int a)
   {
	   System.out.println("a="+a);
	   System.out.println("I am from parametrized method....");
	   new Constructor1().meth3();
	   
   }
   Constructor1(int a,int b)
   {
	   System.out.println("Addition of two number is "+(a+b));
	   
	   
   }
   void meth1()
   {
	   System.out.println("method1 called...");
	   new Constructor1(2).meth2();
   }
   void meth2()
   {
	   System.out.println("method2 called....");
	   new Constructor1(2,3);
   }
   void meth3()
   {
	   System.out.println("method3 called....");
   }
   public static void main(String[] args) 
   {
	  Constructor1 aobj=new Constructor1();
	  // aobj.meth2(); 
	   aobj.meth1();
}
  }
