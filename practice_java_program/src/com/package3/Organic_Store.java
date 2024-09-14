package com.package3;
import java.util.Scanner;

public class Organic_Store {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		Shoping obj=new Shoping();
		System.out.println("==========Welcome to Organic_Store==========");
        System.out.println("Available products in the store");
        System.out.println("1)Fruits");
    	System.out.println("2)Vegetables");
    	System.out.println("3)Cosmetics");
    	System.out.println("4)Masala Powder");
    	
    	System.out.println("please enter your choice?");
    	int choice=scr.nextInt();
    	
    	switch(choice)
    	
    	{
    	case 1: obj.Fruits();
    	        break;
    	         
    	case 2: obj.Vegetable();
	            break;
        
    	case 3: obj.Cosmetics();	      
                break;
        
    	case 4: obj.Masala_Powder();     
                break;
    	}
    	System.out.println("Please choose the product code...");
    	String str=scr.next();
	}

}
