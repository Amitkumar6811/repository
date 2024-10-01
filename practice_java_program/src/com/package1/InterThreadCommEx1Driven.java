package com.package1;

public class InterThreadCommEx1Driven 
  {
  public static void main(String[] args) 
  {
	  InterThreadCommEx1 obj=new InterThreadCommEx1();
	  new Thread() //Anonymous Inner class starts here
	  {
		public void run()
		{
			try
			{
			  obj.with_draw(15000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		} // end here
	  }
	  .start();
	  
	  new Thread()
	  {
		  public void run()
		  {
			 obj.deposit(10000);
		  }
	  } // Anonymous class ends here
	  
	  .start();
  }
  }
