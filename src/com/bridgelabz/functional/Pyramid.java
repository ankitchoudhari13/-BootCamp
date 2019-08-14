package com.bridgelabz.functional;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();

        for(int i=0;i<=(rows/2);i++)
        	
        	      {
        	
        	              for(int j=0;j<(rows/2)-i;j++)
        	
        	              {
        	
        	                      System.out.print(" ");
        	
        	              }
        	
        	             for(int k=0;k<(2*i)+1;k++)
        	
        	              {
        	
        	                      System.out.println("*");
        	
        	              }
        	
        	              System.out.println("\n");
        	
        	      }
        	
        	 
        	
        	      for(int i=0;i<rows/2;i++)
        	
        	      {
        	
        	              for(int j=0;j<i+1;j++)
        	
        	              {
        	
        	                      System.out.print(" ");
        	
        	              }
        	
        	              for(int k=0;k<rows-2-(2*i);k++)
        	
        	              {
        	
        	                      System.out.println("*");
        	
        	              }
        	
        	              System.out.println("\n");
        	
        	       }


	}}
