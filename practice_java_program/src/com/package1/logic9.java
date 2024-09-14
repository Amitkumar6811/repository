package com.package1;

public class logic9 
{
   public static int[] meth1(int[] a)
   {   
	   
	   int max= Math.max(a[0],a[a.length-1]);
	   a[0]=max;
	   a[1]=max;
	   a[2]=max;
	   return a;
   }
   public static void main(String[] args) 
   {
	 int x[]= {1,2,3};
	 int result[]=meth1(x);
	 for(int data:result)
	 {
		 System.out.println(data);
	 }
}
}
