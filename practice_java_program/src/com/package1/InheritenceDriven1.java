package com.package1;

 class InheritenceDriven1 extends Inheritence2
   {
     void meth2()
     {
    	 
    	System.out.println("method 2"); 
    	super.meth1();
    	
     }
     void display()
     {
    	 System.out.println("Hello"); 
     }
     InheritenceDriven1()
     {
    	 super("singer");
    	 System.out.println("I am default construtor from class B");
     }
     InheritenceDriven1(String s,int a)
     {
    	 super();
    	 System.out.println(s);
    	 System.out.println(a);
    	 this.show();
     }
     public static void main(String[] args) 
    {
    	 Inheritence2 aobj=new Inheritence2();
    	 aobj.meth1();
    	 System.out.println("+++++++++++++++++++=");
    	 InheritenceDriven1 aobj2=new InheritenceDriven1();
    	 aobj2.meth1();
    	 aobj2.meth2();
    	 System.out.println("=============================");
    	 Inheritence2 aobj3= new Inheritence2("satyam");
    	 aobj3.meth1();
    	 aobj3.show();
	}
   }
