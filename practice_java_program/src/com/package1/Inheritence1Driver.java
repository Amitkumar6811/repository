package com.package1;

class Inheritence1Driver extends Inheritence1
{
		void meth3()
		{
			System.out.println("method 3 called ");
		}
		public static void main(String[] args) 
		{
			//Inheritence1 aobj=new Inheritence1();
			Inheritence1Driver aobj1=new Inheritence1Driver();
			aobj1.meth1();
			aobj1.meth2();
			aobj1.meth3();
		}
	}
