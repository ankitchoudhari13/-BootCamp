package com.bridgelabz.algorithm;

import java.util.Scanner;

import jdk.jfr.Percentage;

public class practise {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
        int num; // To hold number
       int base;
       int power;
       int result=1;
       System.out.println("");
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        System.out.println("enter base");
        base=console.nextInt();
        System.out.println("enter the power");
        power=console.nextInt();
       
        for(int i=1; i<=power; i++)
        {
            result=result*base;
        }
        
        System.out.println(result);
    }
	

	

}
