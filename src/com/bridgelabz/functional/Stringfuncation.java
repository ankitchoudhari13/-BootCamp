package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Stringfuncation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();
String reverse ="";
String original="";
String str1;

System.out.println("enter the string");

str1=scanner.nextLine();

utility.string(str1,reverse,original);
	}

}
