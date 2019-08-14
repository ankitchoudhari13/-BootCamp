package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int num;
//int j=0;

System.out.println("enter the number");
num=scanner.nextInt();

int k=0;
for(int i=1;i<num;++i) 
{
	for( int j=1;j<num-i;++j) 
	{	
	System.out.println(" ");
	}		
while(k!=2*i-1)
   { 
	System.out.print("*");  
	
	}
	System.out.println("");
}
	
}
	
}



