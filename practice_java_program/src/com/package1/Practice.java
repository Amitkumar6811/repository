package com.package1;
import java.util.Scanner;

public class Practice 
{
	
  static int meth1(int n)
  { 	if(n<0)
	     return 0;
         else
	    return meth1(n*n);
  }
  public static void main(String[] args) 
  {
	 System.out.println(meth1(5));   
}
}
