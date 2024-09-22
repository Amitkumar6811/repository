package com.package1;

public interface InterfaceB 
  {
     void show();
     default void display()
     {
    	 System.out.println("ClassB display()");
     }
     
  }
