package com.bridgelabz.functional;

import java.util.Scanner;

public class Stringf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
String str,b=" ";
System.out.println("enter the string");
str=scanner.toString();
int n=str.length();
for(int i=0;i<n-1;i++) {
	b=b+str.charAt(i);
}


	}

}
