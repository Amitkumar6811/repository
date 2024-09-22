package com.package1;

public  class AbsstractExDriver extends AbstractEx
  {
   public void meth1()
   {
	   System.out.println("abstract method overriden");
   }
    String meth1(String s)
    {
    	System.out.println("string abstract method overriden...");
    	return s;
    }
    AbsstractExDriver()
    {
    	super(20);
    	System.out.println("i am default constructormfrom child class...");
    }
    public static void main(String[] args) 
    {
    	AbstractEx obj=new AbsstractExDriver();
    	obj.meth1();
    	obj.meth1("amit");
	}
  }
