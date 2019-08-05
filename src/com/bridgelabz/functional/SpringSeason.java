package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		int day;
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

System.out.println("enter the month");
month=scanner.nextInt();

System.out.println("enter the day");
day=scanner.nextInt();

utility.month(month,day);
scanner.close();
	}

}
