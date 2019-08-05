package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
System.out.println("enter the year");
Scanner scaner=new Scanner(System.in);
Utility utility=new Utility();
year=scaner.nextInt();
utility.leapp(year);
scaner.close();
	}

}
