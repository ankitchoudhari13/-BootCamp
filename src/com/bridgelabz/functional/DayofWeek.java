package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayofWeek {

	public static void main(String[] args)
	{
	
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();
 int d=0;
 int m=0;
 int y=0;
 
 
 System.out.println("enter the day");
 d=scanner.nextInt();
 
 System.out.println("enter the month");
 m=scanner.nextInt();
 
 System.out.println("enter the year");
 y=scanner.nextInt();
 
 
int day1=utility.mdy(d,m,y);
System.out.println(day1);

scanner.close();
 
 
	}
	}


