package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Intopt {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
Scanner scaner=new Scanner(System.in);
Utility utilit=new Utility();

int Firstnumber;
int secandnumber;
int thirdnumber;

System.out.println("enter the Firstnumber");
Firstnumber=scaner.nextInt();

System.out.println("enter the Secandnumber");
secandnumber=scaner.nextInt();

System.out.println("enter the thirdnumber");
thirdnumber=scaner.nextInt();
utilit.operation(Firstnumber,secandnumber,thirdnumber);
scaner.close();
}
	

	
		
	}


