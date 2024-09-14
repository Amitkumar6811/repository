package com.package1;

public class Wrapper_class 
 {
  public static void main(String[] args) 
  {
	
	  System.out.println("Implementig autoboxing");
		int i=10;
		Integer val=Integer.valueOf(i);
		Integer val2=Integer.valueOf(102);
		Integer val3=Integer.valueOf("293");
		
		System.out.println("pdt"+i);
		System.out.println(val);
		System.out.println(val2);
		System.out.println(val3);
		
		float b1=34;
		Float v1=Float.valueOf(b1);
		Character v2=Character.valueOf('V');
		Character v3=Character.valueOf('3');
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		System.out.println("=============================");
		System.out.println("auto unboxing....");
		
		Double r1=new Double("232");
		Double r2=r1.doubleValue();
		System.out.println(r2);
		
		
}
}
