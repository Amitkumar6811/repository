package com.package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamEx1 
  {
     public static void main(String args[]) throws Exception
     {
    	 System.out.println("Implementing Object stream...");
    	 ClassB2 Bobj=new ClassB2();
    	 ClassA2 aobj=new ClassA2();
    	 
    	 System.out.println(Bobj.x+" "+Bobj.y);
    	 System.out.println(aobj.a+" "+aobj.b);
    	 
    	 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\amit kumar\\file\\data.ser"));
    	 System.out.println("Connection created...");
    	 
    	 oos.writeObject(Bobj);
    	 oos.writeObject(aobj);
    	 oos.close();
    	 
    	 System.out.println("Serialization completed...");
    	 
    	 System.out.println("Deserialization started...");
    	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\amit kumar\\file\\data.ser"));
    	System.out.println("Connection created...");
    	
    	ClassA2 aobj2=(ClassA2)ois.readObject();
    	ClassB2 bobj2=(ClassB2)ois.readObject();
    	
    	System.out.println(aobj2.a+" "+aobj2.b);
    	System.out.println(bobj2.x+" "+bobj2.y);
    	ois.close();
     }
     
  }
