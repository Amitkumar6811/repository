package com.package1;

import java.util.Scanner;

public class Encapsulation2Driver 
   {
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		Encapsulation2 aobj1=new Encapsulation2();
		System.out.println("Enter Employee Name: ");
		aobj1.setEmp_Name(scr.nextLine());
		System.out.println("Enter Employee Exprience: ");
		aobj1.setEmp_Exp(scr.nextInt());
		System.out.println("Enter Employee Salary: ");
		aobj1.setEmp_Sal(scr.nextInt());
		
		System.out.println("Employee Details....");
		System.out.println("Name: "+aobj1.getEmp_Name());
		System.out.println("Exprience: "+aobj1.getEmp_Exp());
		System.out.println("Salary: "+aobj1.getEmp_Sal());
		scr.close();
	}
   }
