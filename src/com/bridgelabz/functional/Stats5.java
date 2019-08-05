package com.bridgelabz.functional;


import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

double x=Math.random();
double y=Math.random();
double z=Math.random();
double a=Math.random();
double b=Math.random();

System.out.println(x);
System.out.println(y);
System.out.println(z);
System.out.println(a);
System.out.println(b);


utility.add(x,y,z,a,b);
scanner.close();
	}

}
