package com.package1;

public class arry1 {

	void meth1()
	{
		// TODO Auto-generated method stub
		int arr_1[]=new int[5];
		int arr2[];
		 arr2=new int[10];
		int[] arr3 =new int[] {324,23,435,243};
		int arr4[]= {123,543,463};	
		arr2[3]=12;
		arr2[0]=4;
		arr2[1]=3;
		
		arr_1[0]=5;
		arr_1[2]=5;
		System.out.println();
		//find the length of the array
		System.out.println("arr1 "+arr_1);
		System.out.println("arr2 "+arr2.length);
		System.out.println("arr3 "+arr3.length);
		System.out.println("arr4 "+arr4.length);
		for(int data:arr_1)
		{
			System.out.print(data);
		}
		System.out.println();
		for(int i=arr_1.length-1;i>=0;i--)
		{
			System.out.print(arr_1[i]);
		}
		
	}
	public static void main(String[] args) 
	{
	    arry1 obj=new arry1();
	    obj.meth1();
	    
	    
	}

}
