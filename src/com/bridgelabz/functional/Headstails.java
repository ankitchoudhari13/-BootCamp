package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Headstails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

float number;

System.out.println("enter the number");
number=scanner.nextFloat();

utility.possi(number);
scanner.close();

	}

}
