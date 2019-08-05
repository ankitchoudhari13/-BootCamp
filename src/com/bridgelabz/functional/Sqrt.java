package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;




public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		int number;
		
		System.out.println("enter the number");
		number=scanner.nextInt();

		utility.newt(number);
		scanner.close();
	}

}
