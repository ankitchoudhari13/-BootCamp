package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		double firstnumber;
		double secandnumber;
		double thirdnumber;
		
		
		
		System.out.println("enter the firstnumber");
		firstnumber=scanner.nextInt();
		
		System.out.println("enter the secandnumber");
		secandnumber=scanner.nextInt();
		
		System.out.println("enter the thirdnumber");
		thirdnumber=scanner.nextInt();
		
		
		
		utility.operatio(firstnumber,secandnumber,thirdnumber);
		scanner.close();
	}

}
