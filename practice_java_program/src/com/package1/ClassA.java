package com.package1;

public class ClassA 
{
	void meth1()
	{
		System.out.println("method1 is  calling..");
	}
	void meth2()
	{
		System.out.println("method2 is calling..");
		new Constructor1().meth3();
	}
	public static void main(String[] args) 
	{
		ClassA C=new ClassA();
		C.meth2();
	}
}
