package com.package1;

import java.util.ArrayList;
import java.util.Iterator;


//Implement Array list

public class ArrayListEx1 
  {
    void meth1()
    {
    	System.out.println("Implementing ArrayList...");
    	ArrayList<Object> al=new ArrayList<>();
    	al.add(12); //Insertion order is maintain
    	al.add("amit"); //Heterogeneous data is allowed
    	al.add(null);// null is allowed
    	al.add(12);; // Duplicates value is allowed
    	al.add(75);// it available from java 1.2 v
    	al.add('A');// it default capacity is 10 [it size increase by half]
    	al.add('S'); // it is not synchronize by default
    	
    	// Retrieve data directly
    	
    	System.out.println(al);
    	System.out.println("get() "+al.get(2));
    	System.out.println("get() "+al.get(al.size()-1));
    	System.out.println("size() "+al.size());
    	System.out.println("=============================");
    	System.out.println("Reteriving data by using for loop ");
    	
    	for(int i=0;i<al.size();i++)
    	{
    		System.out.print(al.get(i)+" ");
    	}
    	System.out.println();
    	System.out.println("=======================================");
    	System.out.println("Reterive the data in reverse order ");
    	for(int i=al.size()-1;i>=0;i--)
    	{
    		System.out.print(al.get(i)+" ");
    		
    	}
    	System.out.println();
    	System.out.println("=========================================");
    	System.out.println("Reteriving the data by using for each loop");
    	for(Object data:al)
    	{
    		System.out.print(data+" ");
    	}
    	System.out.println();
    	System.out.println("=========================================");
    	System.out.println("Reteriving the data by using Iterator Interface");
    	Iterator<Object> i=al.iterator();
    	while(i.hasNext())
    	{
    		System.out.print(i.next()+" ");
    	}
    	System.out.println();
    	
    	System.out.println("-----------Array Methods-----------");
    	al.add(al.size(),100); //add data at the last index
    	al.add(0,10); //add data at first index
    	System.out.println(al.isEmpty()); // check array is empty or not
    	System.out.println(al.contains(100)); //check data is available or not
    	System.out.println("-----------Remove method-----------");
    	System.out.println(al);
    	//al.remove((Object)'S');
    	//System.out.println(al.remove((Object)'S'));
    	//System.out.println(al.remove(4));
    	//System.out.println(al);
    
    	
    	
    }
    public static void main(String[] args) 
    {
		new ArrayListEx1().meth1();
	}
  }
