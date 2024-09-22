package com.package1;

public class ClassA1 extends ClassB1 implements InterfaceA,InterfaceB
   {
      public void meth1()
      {
    	  System.out.println("Override meth1 InterfaceA");
      }
      public void show()
      {
    	 System.out.println("InterfaceB abstract method overriden"); 
      }
    public void display()
    {
    	InterfaceA.super.display();
    	InterfaceB.super.display();
    }
	public static void main(String[] args) 
	  {
	        InterfaceA aobj = new ClassA1();
	        aobj.meth1();
	        aobj.meth2();
	        InterfaceA.meth4();
	        
	        System.out.println("===================");
	        
	        InterfaceB bobj=new ClassA1();
	        bobj.show();
	        System.out.println("-------------------------");
	        
	        ClassA1 obj=new ClassA1();
	        obj.display();
	        
	        
	 }
   }
