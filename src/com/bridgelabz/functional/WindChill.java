package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

double firstnumber;
double secandnumber;


System.out.println("enter the firstnumber");
firstnumber=scanner.nextDouble();

System.out.println("enter the secandnumber");
secandnumber=scanner.nextDouble();

utility.wether(firstnumber,secandnumber);
scanner.close();

	}

}
