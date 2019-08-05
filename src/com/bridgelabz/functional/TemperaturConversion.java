package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {

	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
	double fahrenheit;
	double Celsius;
	
	System.out.println("enter the fahrenhit temperatur");
	fahrenheit=scanner.nextDouble();
	
	System.out.println("enter the celsius temperatur");
	Celsius=scanner.nextDouble();
	
	utility.temcon(fahrenheit,Celsius);
	scanner.close();
		}
}
