package com.package1;

//102==120
//234==204
//122==122

public class logic1 
  {
    int[] meth1()
    {
    	
    	int arr[]= {2,3,4};
    	for(int i=0;i<=arr.length-1;i++)
    	{
    		if(arr[i]==2 && arr[i+1]==3)
    			arr[i+1]=0;
    	}
    	return arr;
    }
    public static void main(String[] args) 
    {
		logic1 obj=new logic1();
		int result[]=obj.meth1();
		for(int data:result)
		System.out.println(data);
	}
  }
