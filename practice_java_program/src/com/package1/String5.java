package com.package1;
import java.util.Scanner;
public class String5 
{
  static void meth1(String s)
   {
	  String rev="";
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  rev=rev+s.charAt(i);
	  }
	  if(s.equalsIgnoreCase(rev))
	  {
		  System.out.println("it is a palendrome...");
	  }
	  else
	  {
		  System.out.println("not a palendrome");
	  }
   }
   public static void main(String[] args) 
   {
	   Scanner scr=new Scanner(System.in);
	   System.out.println("enter name");
	   meth1(scr.next());
	   
}
}
