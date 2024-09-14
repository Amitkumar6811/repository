package com.package1;

public class logic6 
{
  static int meth1(int arr[])
  {
	  int sum=0;
	  for(int i=0;i<=arr.length-1;i++)
	  {
		  sum=sum+arr[i];  
	  }
	  return sum;  
  }
  public static void main(String[] args) 
  {
	int x[]= {1,2,3,3,45};
	System.out.println(meth1(x));
}
}
