package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Trig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

double x;
System.out.println("enter the two number");
x=scanner.nextDouble();


utility.mathfun(x);
scanner.close();
	}

}
