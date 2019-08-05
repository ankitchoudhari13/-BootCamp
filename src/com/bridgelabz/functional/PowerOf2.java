package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

int number;

System.out.println("ente the number");
number=scanner.nextInt();

utility.table(number);

scanner.close();


	}

}
