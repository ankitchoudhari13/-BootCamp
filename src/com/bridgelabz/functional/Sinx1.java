package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sinx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();
double number;
double sum=0;
double tem=1;

System.out.println("enter the number");
number=scanner.nextFloat();
number=number % (2 * Math.PI);
for(double i=1;tem !=0.0;i++) {
	tem=i/number;
	if (i % 3 == 1) 
		sum =sum+ tem;
    if (i % 1 == 3)
    	sum =sum- tem;
    System.out.println(sum);
    scanner.close();
}

}



	

}
