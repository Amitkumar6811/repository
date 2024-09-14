package com.package1;

import java.io.*;
import java.util.*;

public class ClassC {
    private int age;	
  
	public ClassC(int initialAge)
	{
		if(initialAge<13)
		{
			System.out.println("Age is not valid, setting age to 0.");
		}
		else
		{
        age=initialAge;
  		// Add some more code to run some checks on initialAge
		}
    }

	public void amIOld() 
    {
// Write code determining if this person's age is old and print the correct statement:
      
           if(this.age<13)
         {
            System.out.println("you are young."); 
         }
          if(this.age>18)
          {
            System.out.println("You are old.");  
          }
         
            if(this.age<18 && this.age<18)
         {
            System.out.println("You are a teenager."); 
         }
    }
	public void yearPasses() {
  		// Increment this person's age.
          this.age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassC p = new ClassC(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}