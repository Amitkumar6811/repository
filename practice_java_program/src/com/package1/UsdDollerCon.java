package com.package1;

import java.util.Scanner;

public class UsdDollerCon 
   {
      static double getInput(int doller)
      {
    	  double rupees=(double)(doller*83.4);
    	 // System.out.println(rupees);
    	  return rupees;
      }
      public static void main(String[] args)
      {
    	  Scanner scr=new Scanner(System.in);
    	  UsdDollerCon obj=new UsdDollerCon();
    	  System.out.println("Enter currency in $ ");
    	  int doller=scr.nextInt();
    	  System.out.println("Total amount in rupees is:\n"+UsdDollerCon.getInput(doller));
    	  scr.close();	 
	 }
   }
