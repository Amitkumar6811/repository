package com.package1;

public class Encapsulation2 
  {
   private String Emp_Name;
   private int Emp_Exp;
   private int emp_Sal;
		public String getEmp_Name() {
			return Emp_Name;
		}
		public void setEmp_Name(String emp_Name) {
			Emp_Name = emp_Name;
		}
		public int getEmp_Exp() {
			return Emp_Exp;
		}
		public void setEmp_Exp(int emp_Exp) {
			Emp_Exp = emp_Exp;
		}
		public int getEmp_Sal() {
			return emp_Sal;
		}
		public void setEmp_Sal(int emp_Sal)
		{
			if(Emp_Exp>10)
			{
				emp_Sal+=(emp_Sal*10)/100;
			}
			this.emp_Sal = emp_Sal;
		}
  }
