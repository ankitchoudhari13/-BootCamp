package com.bridgelabz.functional;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int number;
int sum=0;
System.out.println("enter the number");
number=scanner.nextInt();

while(number>1) {
	number=number/10;
	int r=number%10;
	sum=sum+(r*r);
}

if(sum==1) {
	System.out.println(" the happy number");
	
}
else {
	System.out.println("not happy number");
}



}
}