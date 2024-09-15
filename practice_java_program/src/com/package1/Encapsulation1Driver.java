package com.package1;

import java.util.Scanner;

public class Encapsulation1Driver 
   {
    public static void main(String[] args) 
    {
    	Scanner scr=new Scanner(System.in);
    	Encapsulation1 aobj=new Encapsulation1();
    	System.out.println("Enter student Name...");
    	aobj.student_Name(scr.nextLine());
    	System.out.println("Enter student RollNo...");
    	aobj.student_rollNo(scr.nextInt());
    	System.out.println("=============================");
    	System.out.println("student Details...");
    	System.out.println("Name: "+aobj.student_Name());
    	System.out.println("Roll No: "+aobj.student_rollNo());
    	scr.close();
	}
   }
