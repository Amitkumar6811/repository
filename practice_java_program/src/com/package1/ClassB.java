package com.package1;

public class ClassB 
 {
  int a=10;
  public String testMethod()
  {
	   new ClassB(100,200,"java");
	  System.out.println("a="+a);
	  return "java";
  }
  ClassB()
  {
	  System.out.println("non parameterize constructor..");
  }
  public int testMethod2()
  {
	  System.out.println(50);
	  return 10+15;
  }
  ClassB(int a)
  {
	  System.out.println("java is awesome..");
  }
  
  public String testMethod3(int a)
  {
	  System.out.println("19");
	  return "is";
  }
  ClassB(int a,int b,String s)
  {
	  System.out.println("a+b="+(a+b));
	  System.out.println(s);
  
  }
  public String testMethod4(String s)
  {
	  System.out.println(88);
	  return "good";
  }
   public static void main(String[] args) 
   {
    ClassB t1=new ClassB();
    t1.a=10;
    ClassB t2=new ClassB();
    t2.a=30;
    
}
 }
