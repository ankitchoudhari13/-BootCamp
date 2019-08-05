package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Utility utility=new Utility();
int number;

System.out.println("enter the number");
number=scanner.nextInt();

utility.harm(number);
scanner.close();
	}

}
