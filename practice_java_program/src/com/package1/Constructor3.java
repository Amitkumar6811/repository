package com.package1;

public class Constructor3 
  {
     String studentname;
     int studentid;
     String studentdept;
     
     Constructor3(String name,int id, String dept)
     {
    	 studentname=name;
    	 studentid=id;
    	 studentdept=dept;
     }
     
     public static void main(String args[]) 
     {
    	// System.out.println("first argument="+args[0]);
    	 //System.out.println("second argument="+args[1]);
	  Constructor3 obj=new Constructor3("Amit",101,"B.tech");
	  Constructor3 obj1=new Constructor3("Mandeep",102,"M.tech");
	  Constructor3 obj2=new Constructor3("Abhinandan",103,"MBBS");

	  System.out.println(obj.studentname+" "+obj.studentid+" "+obj.studentdept);
	  System.out.println(obj1.studentname+" "+obj1.studentid+" "+obj1.studentdept);
	  System.out.println(obj2.studentname+" "+obj2.studentid+" "+obj2.studentdept);
	  
	 }
   }
