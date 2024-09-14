package com.package1;

public class To_dimension_Array 
{
  void meth1()
  {
	  int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	  for(int i=0;i<3;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  System.out.println(arr[i][j]+" ");
		  }
	  }
  }
  public static void main(String[] args) 
  {
	  To_dimension_Array obj=new To_dimension_Array();
	  obj.meth1();
}
}
