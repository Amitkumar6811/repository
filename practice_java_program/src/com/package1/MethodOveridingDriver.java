package com.package1;

public class MethodOveridingDriver extends MehodOverridingex1 
   {
   protected void meth1()
  {  
	   super.meth1(); 
	  System.out.println("I am child class method");
	  
  }
  public void meth2(int a)
  {
	  super.meth2(4);
	System.out.println("child class meth2 "+a);  
  }
  MethodOveridingDriver meth3()
  {
	  super.meth3();
	  System.out.println("child class meth3");
	  return new MethodOveridingDriver();
  }
  static void meth4()
  {
	 // super.meth4();
	  System.out.println("child class static meth4 ");
  }
  public static void main(String[] args) 
   {
	  MehodOverridingex1 obj=new MethodOveridingDriver();
	  obj.meth1();
	  obj.meth2(3);
	  obj.meth3();
	  obj.meth4();
	  meth4();
   }
  }
