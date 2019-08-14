package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Mathfuncation {

	public static void main(String[] args){
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();
int number;
int fact=1;
System.out.println("enter the number");
number=scanner.nextInt();
utility.factoria(number,fact);
	}

}
