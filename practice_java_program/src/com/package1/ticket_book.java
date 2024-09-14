package com.package1;
import java.util.Arrays;
import java.util.Scanner;

public class ticket_book 
   {
      void meth1()
      {
    	  Scanner scr=new Scanner(System.in);
    	  System.out.println("How many ticket you want");
    	  String names[]=new String[scr.nextInt()];
    	  System.out.println("you need "+names.length+" tickets");
    	  System.out.println("please enter "+names.length+" names");
    	  
    	  for(int i=0;i<=names.length-1;i++)
    	  {
    		  names[i]=scr.next();
    	  }
    	  System.out.println();
    	  System.out.println("retrivinfg data through for each loop");
    	  for(String data:names)
    	  {
    		  System.out.println(data);
    	  }
    	  System.out.println();
    	  
    	  System.out.println("data present in array"+Arrays.toString(names));
    	  if(names.length>=2)
    	  {
    		  System.out.println("======>"+names[names.length-2]);
    	  }
    	  else
    	  {
    		  System.out.println("=======>"+names[names.length-1]);
    	  }
    	  scr.close();
      }
     public static void main(String[] args) 
     {
		ticket_book obj=new ticket_book();
		obj.meth1();
	}

	}
   
