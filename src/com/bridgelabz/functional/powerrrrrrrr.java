package com.bridgelabz.functional;

import java.util.Scanner;

public class powerrrrrrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner console = new Scanner(System.in);
	       
	     
	        int number;
	        
	       int firstTerm = 0,
	               secondTerm = 1,
	               thirdTerm;
	    
	           System.out.print("Enter number of terms of series : ");
	           number = console.nextInt();
	    
	           System.out.print(firstTerm + " " + secondTerm + " ");
	    
	           for(int i = 0; i <= number; i++)
	   	{
	               thirdTerm = firstTerm + secondTerm;
	               System.out.print(thirdTerm + " ");
	               firstTerm = secondTerm;
	               secondTerm = thirdTerm;
            }
	}
	    
	       
}
