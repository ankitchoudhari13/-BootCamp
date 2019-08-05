package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Carloan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

float principal;
float intrest
;
float year;

System.out.println("enter the principal");
principal=scanner.nextFloat();

System.out.println("enter the intrest");
intrest=scanner.nextFloat();

System.out.println("enter the year");
year=scanner.nextFloat();

utility.amount(principal,intrest,year);
scanner.close();
	}

}
