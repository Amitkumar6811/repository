package com.package1;

public class Employee_details 
   {
   private String Employee_name;
   private int Employee_Exp;
   private double Employee_sal;
   
   public String getEmployee_name()
   {
	   return Employee_name;
   }
   public void setEmployee_Name(String Ename)
   {
	   this.Employee_name=Ename;
   }
   public int getEmployee_Exp()
   {
	   return Employee_Exp;
   }
   public void setEmployee_Exp(int Exp)
   {
	   this.Employee_Exp=Exp;
	   
	  
   }
   public double getEmployee_Sal()
   {
	   return Employee_sal;
	   
   }
   public void setEmployee_sal(double sal)
   {
	   this.Employee_sal=sal;
	   if(Employee_Exp>10)
	   {
		   Employee_sal=Employee_sal+(Employee_sal*0.1);
		   
	   }
   }
   
   
}
  
