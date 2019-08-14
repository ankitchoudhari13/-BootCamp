package com.bridgelabz.functional;

import java.util.Scanner;



public class Practisee {



	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);	
		
int number;
System.out.println("enter the number");
number=scanner.nextInt();
int no=0;
for(int i=1;i<=number;i++) {
	for(int j=number-1;j>=i;j--) {
		System.out.print("no ");
		no=no+i-j;
	}
	
	System.out.println();System.out.println();
}

}
	}

	
	

