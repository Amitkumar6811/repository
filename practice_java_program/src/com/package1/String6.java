package com.package1;

public class String6 
{
     static String meth1(String out,String word)
     {
    	 return out.substring(0,2)+word+out.substring(2,4);
     }
     public static void main(String[] args) 
     {
		System.out.println(meth1("<<>>","java"));
	}
}
