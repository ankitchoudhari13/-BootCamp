package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Dobulee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstnuber;
		double secandnumber;
		double thirdnumber;
		
		Scanner scaner=new Scanner(System.in);
		Utility utility=new Utility();
		
		System.out.println("enter the first nuber");
		firstnuber=scaner.nextDouble();
		
		System.out.println("enter the secandnumber");
		secandnumber=scaner.nextDouble();
		
		System.out.println("enter the thirdnumber");
		thirdnumber=scaner.nextDouble();
		
		utility.douoper(firstnuber,secandnumber,thirdnumber);
		scaner.close();
	}
	

}
