package com.package1;

public class Inheritence2 
  {
    public void meth1()
    {
    	System.out.println("method 1 from class A");
    }
    public void show()
    {
    	System.out.println("I am show method...");
    }
    Inheritence2()
    {
    	System.out.println("I am default constructor");
    }
    Inheritence2(String s)
    {
    	this();
    	System.out.println(s);
    }
  }
