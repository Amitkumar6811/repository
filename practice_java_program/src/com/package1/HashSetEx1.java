package com.package1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashSetEx1 
  {
     void meth1()
     {
    	 System.out.println("Implementing hashset...");
    	 HashSet<Object> set=new HashSet<>();
    	 set.add(100); // insertion order not maintained
    	 set.add("java"); // duplicate is not allowed
    	 set.add('A');  // null allowed
    	 set.add(100);  // available from java 1.2v
    	 set.add(null); // heterogeneous data is allowed
    	 set.add(400);  // default capacity is 16 [load factor 0.75] 
    	 
    	 System.out.println(set);
    	 
    	 System.out.println("Reterive data by using iterator");
    	 Iterator<Object> i=set.iterator();
    	 while(i.hasNext())
    	 
    	 {
    		 System.out.print(i.next()+" ");
    	 }
    	 
    	 
    	 System.out.println("==========================");
    	 System.out.println("Reterived data by using LinkedList");
    	 
    	 LinkedList<Object> ll=new LinkedList<>(set);
    	 
    	 ListIterator<Object> li=ll.listIterator();
    	 
    	 while(li.hasNext())
    	 {
    		 System.out.print(li.next()+" ");
    	 }
    	 System.out.println();
    	 while(li.hasPrevious())
    	 {
    		 System.out.print(li.previous()+" ");
    	 }
     }
     public static void main(String[] args) 
     {
		new HashSetEx1().meth1();
	}
  }
