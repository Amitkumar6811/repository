package com.package1;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx1 
  {
     void meth1()
     {
    	 System.out.println("Implementing vector");
    	 Vector<Object> v=new Vector<>();
    	 v.add(10); //Insertion order is maintained
    	 v.add(null); // Null is Allowed
    	 v.add("Amit"); // Heterogeneous data allowed
    	 v.add('A');    // it is available from java 1.0 v
    	 v.add(10); // Duplicate data is allowed
    	 v.add(100); // it default capacity is 10 [it size increase by double]
    	 v.add("alksfhkl"); // it is synchronized by default
    	 System.out.println(v);
    	 
    	 System.out.println("==============================");
    	 
    	 System.out.println("capacity()==> "+v.capacity());
    	 System.out.println("size()=====> "+v.size());
    	 
    	 System.out.println("Retrieved data by using for each loop");
    	 for(Object obj: v)
    	 {
    		 System.out.print(obj+" ");
    	 }
    	 System.out.println();
    	 System.out.println("Retrieved data by using Enumeration ");
    	  
    	 Enumeration<Object> e=v.elements();
    	 while(e.hasMoreElements())
    	 {
    		 System.out.print(e.nextElement()+" ");
    	 }
    	 
     }
     public static void main(String[] args) 
     {
    	new VectorEx1().meth1();
	}
  }
