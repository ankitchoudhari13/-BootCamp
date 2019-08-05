package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sintaylor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

int number;
float angle;

System.out.println("enter the number");
number=scanner.nextInt();

System.out.println("enter the angle");
angle=scanner.nextFloat();

utility.taylor(number,angle);
 
	}

}
