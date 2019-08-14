package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Ci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

int  money;
int year;
float intrest;
System.out.println("enter the money");
money=scanner.nextInt();
System.out.println("enter the year");
year=scanner.nextInt();
System.out.println("enter the intrest");
intrest=scanner.nextFloat();

utility.presentValue(money,year,intrest);
	}

}
