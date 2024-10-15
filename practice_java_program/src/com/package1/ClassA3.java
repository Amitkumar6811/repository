package com.package1;

public class ClassA3 
  {
       String empName;
       int empId;
       String empDept;
       
       ClassA3(String empName,int empId,String empDept)
       {
    	   this.empName=empName;
    	   this.empId=empId;
    	   this.empDept=empDept;
       }

	@Override
	public String toString() {
		return "[empName=" + empName + ", empId=" + empId + ", empDept=" + empDept + "]";
	}
       
  }
