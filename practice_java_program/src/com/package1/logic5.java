package com.package1;

public class logic5 
{
   static boolean meth1(Object...arr)
    {
    	if(arr.length>=1 && arr[0]==arr[arr.length-1])
    	{
    		return true;
    	}
    	return false;
    }
    public static void main(String[] args) 
    {
		System.out.println(meth1(1,2,1));
	}
}
