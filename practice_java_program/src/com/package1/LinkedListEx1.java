package com.package1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx1 
  {
     void meth1()
     {
    	 System.out.println("Implementing linked list...");
    	 LinkedList<Object> ll=new LinkedList<>();
    	 ll.add(11); // Heterogeneous data is allowed
    	 ll.add(200);// null is allowed 
    	 ll.add(null); // not synchronize
    	 ll.add("Amit");// it default size 10 increase by double
    	 ll.add(200); // available from java 1.2 v
    	 ll.add('A'); // duplicate is allowed
    	 ll.add("Ankit kumar");
    	 ll.add(400);
    	 ll.add('A');
    	 
    	 System.out.println(ll);
    	 System.out.println("====================================");
    	 System.out.println("reterived data using List Iterator");
    	 ListIterator<Object> li=ll.listIterator();
    	 while(li.hasNext())
    	 {
    		 System.out.print(li.next()+" ");
    	 }
    	 System.out.println("======================");
    	
     }
     public static void main(String[] args) 
     {
		new LinkedListEx1().meth1();
	}
  }
