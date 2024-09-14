package com.package1;

public class logic8 
{
  static int[] meth1(int[] arr)
  {
	  int arr1[]= new int[2*arr.length];
	  arr1[arr1.length-1]=arr[arr.length-1];
	  return arr1;
  }
  public static void main(String[] args) 
  {
	int x[]= {1,2,3};
	int[] result=meth1(x);
	for(int data:result)
	{
		System.out.println(data);
	}
}
}
