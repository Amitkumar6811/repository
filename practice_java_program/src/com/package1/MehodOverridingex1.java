package com.package1;

public class MehodOverridingex1
   {
    void meth1()
    {
    	System.out.println("I am parent class method...");
    } 
    public void meth2(int a)
    {
    	System.out.println("parent class method 2"+a);
    }
    MehodOverridingex1 meth3()
     {
    	System.out.println("Parent class meth3");
    	return new MehodOverridingex1(); 
     }
    static void meth4()
    {
    	System.out.println("Parent class static method4");
    }
    }
