package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Collinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

int x1,x2,x3;
int y1,y2,y3;
System.out.println("enter the point");
x1=scanner.nextInt();
x2=scanner.nextInt();
x3=scanner.nextInt();
y1=scanner.nextInt();
y2=scanner.nextInt();
y3=scanner.nextInt();

utility.coliner(x1,x2,x3,y1,y2,y3);

	
	}
}
