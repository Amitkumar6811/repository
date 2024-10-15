package com.package1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 
  {
     void meth1()
     {
    	System.out.println("Passing user define object into ArrayList...");
    	ArrayList <Object> al=new ArrayList<>();
    	ClassA3 obj=new ClassA3("amit",122,"CSE");
    	ClassA3 obj1=new ClassA3("saurabh",123,"IT");
    	ClassA3 obj2=new ClassA3("dhiraj",15,"CIVIL");
    	ClassA3 obj3=new ClassA3("Bittu",167,"EEC");
    	al.add(obj);
    	al.add(obj1);
    	al.add(obj2);
    	al.add(obj3);
    	System.out.println(al);
    	System.out.println("=====================");
    	System.out.println("Reterived data by using iterator");
    	Iterator<Object> i=al.iterator();
    	while(i.hasNext())
    	{
    		System.out.print(i.next()+" ");
    	}
       
     }
     public static void main(String[] args)
     {
    	 new ArrayListEx2().meth1();
	}
  }
