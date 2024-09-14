package com.package1;

public class logic4 
{
    static boolean meth1(int a[],int b[])
    {
    	if(a[0]==b[0]|| a[a.length-1]==b[b.length-1]) 
    	{
    		return true;
    	}
    	return false;
    }
    public static void main(String[] args)
    {
		int x[]= {6,8,9,0};
		int y[]= {9,2,3,1};
		System.out.println(meth1(x,y));
	}
}
