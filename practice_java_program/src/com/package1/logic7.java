package com.package1;

public class logic7 
  {
   public static  int[] meth1(int[] a,int[] b)
     {
    	 return new int[] {a[1],b[1]};
     }
   public static void main(String[] args) 
   {
	int[] x= {6,8,9};
	int[] y= {10,20,30};
	int[] result=meth1(x,y);
	for(int data:result)
	{
		System.out.println(data);
	}
}
  }
