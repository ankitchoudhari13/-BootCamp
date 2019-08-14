package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();
double year;
double intrest;
double money;
System.out.println("enter the year");
year=scanner.nextInt();
System.out.println("enter the intrest");
intrest=scanner.nextDouble();
System.out.println("money");
money=scanner.nextDouble();
utility.compund(year,money,intrest);
	}

}
