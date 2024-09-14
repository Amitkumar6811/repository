package com.package1;

public class logic2 
  {
     int meth1(int[] arr)
     {
    	 if(arr.length>=2)
    	 {
    		 return arr[0]+arr[1];
    	 }
    	 else if(arr.length==1)
    	 {
    		 return arr[0];
    	 }
    	 else
    	 {
    		 return 0;
    	 }
     }
     public static void main(String[] args) 
     {
		logic2 obj1=new logic2();
		int result=obj1.meth1(new int[]{});
		System.out.println(result);
		
	}
  }
