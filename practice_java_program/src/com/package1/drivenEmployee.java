package com.package1;
import java.util.Scanner;

public class drivenEmployee
{
public static void main(String[] args) 
{
	Scanner scr=new Scanner(System.in);
	Employee_details aobj=new Employee_details();
	System.out.println("please enter employee name...");
	aobj.setEmployee_Name(scr.nextLine());
	System.out.println("Please enter employee Experience...");
	aobj.setEmployee_Exp(scr.nextInt());
	System.out.println("Please enter employee salary...");
	aobj.setEmployee_sal(scr.nextDouble());
	System.out.println("Employee_name is: "+ aobj.getEmployee_name());
	System.out.println("Employee_Exp is:  "+  aobj.getEmployee_Exp());
	System.out.println("Employee_sal is:  "+  aobj.getEmployee_Sal());
}
}
