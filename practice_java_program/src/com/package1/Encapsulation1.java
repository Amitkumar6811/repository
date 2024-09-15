package com.package1;

public class Encapsulation1 
   {
      private String student_Name;
      private int student_rollNo;
      
     public void student_Name(String name) // setter method
      {
    	  this.student_Name=name;
      }
      
      public String student_Name() //Getter method
      {
    	  return student_Name;
      }
      public void student_rollNo(int rollNo) //setter method
      {
    	  this.student_rollNo=rollNo;
      }
     public int student_rollNo()
     {
    	 return student_rollNo;
     }
      
   }
