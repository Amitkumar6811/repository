package com.package1;

import java.util.Arrays;

public class stringex 
 {
     void meth1()
     {
    	 String s="amit kumar";
    	 String str=new String();
    	 char arr[]= {'a','b','c','c'};
    	 String str2=new String(arr);
    	 System.out.println(str2.toUpperCase().charAt(0)+str2.substring(1,str2.length()-1));
    	 System.out.println(str2);
    	 String str3=new String(Arrays.toString(arr)+s);
    	 System.out.println("=====>"+str3);
    	 String str4=new String(arr,2,2);
    	 System.out.println(str4);
     }
    
	public static void main(String[] args) 
     {
		     stringex obj=new stringex();
		     obj.meth1();
	}
 }
