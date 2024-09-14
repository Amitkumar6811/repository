package com.package1;

import java.util.Arrays;

public class string3 
  {
     void meth1()
     {
    	 String date="8/sep/2024";
    	 String msg="I love you";
    	 
    	 String arr1[]=date.split("/");
    	 System.out.println(Arrays.toString(arr1));
    	 
    	 String arr2[]=msg.split(":",2);
    	 System.out.println(Arrays.toString(arr2));
    	 
     }
     public static void main(String[] args)
     {
		string3 str=new string3();
		str.meth1();
	}
  }
