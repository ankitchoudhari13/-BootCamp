package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		
Scanner scaner=new Scanner(System.in);
Utility utility=new Utility();
 int x;
int y;
System.out.println("enter the  number");
x=scaner.nextInt();

System.out.println("enter the number");
y=scaner.nextInt();

utility.distopt(x,y);
scaner.close();

	}

}
