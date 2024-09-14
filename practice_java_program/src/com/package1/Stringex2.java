package com.package1;

public class Stringex2 
  {
       static String meth1(String name)
        {
        	return "hello ".concat(name)+"!";
        }
        public static void main(String[] args) 
        {
			Stringex2 obj=new Stringex2();
			System.out.println(meth1("bob"));
		}
        
   }
