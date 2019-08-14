package com.bridgelabz.functional;

import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter 0 stop the stopwatch");
int start=scanner.nextInt();
long starttime=0;
 long stopTime=0;
if(start==0) { 
	
	 starttime = System.currentTimeMillis();
	
	System.out.println(starttime);
}

System.out.println("enter 1 stop the stopwatch");
int stop=scanner.nextInt();

if(stop==1) { 
	 stopTime = System.currentTimeMillis();

	double Elapsedtime=(stopTime-starttime)/1000;
	
	System.out.println(Elapsedtime);
	}
	}

	

}
