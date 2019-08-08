package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility  utility=new Utility();
int number;
System.out.println("enter the decimal number");
number=scanner.nextInt();

utility.conv(number,"");
	}

}
