package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Primefactorization {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Utility utility=new Utility();
		int num; // To hold number
        int fact = 1; // To hold factorial
        
        System.out.print("Enter the number");
        num = console.nextInt();
		utility.fact(num,fact);
		console.close();
	}

}
