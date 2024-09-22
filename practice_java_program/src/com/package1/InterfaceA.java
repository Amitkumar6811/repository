package com.package1;

public interface InterfaceA 
 {
     void meth1();
    
    default void meth2()
     {
    	System.out.println("default method of intefaceA"); 
         this.meth3();
     }
    private void meth3()
    {
    	System.out.println("privae mthod of InterfaceA");
    	
    }
    static int meth4()
    {
    	System.out.println("I am static method of InterfaceA");
    	return 0;
    }
    default void display()
    {
    	System.out.println("classA display()");
    }
    
 }
