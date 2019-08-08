package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		int firstnumber;
		int secandnumber;
		System.out.println("enter the number");
		firstnumber=scanner.nextInt();
		secandnumber=scanner.nextInt();
		
		
		utility.check(firstnumber,secandnumber);
		scanner.close();
	}

}
