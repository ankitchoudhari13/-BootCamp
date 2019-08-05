package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfTwoDice {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();
int dice1;
int dice2;
dice1 = (int)(Math.random()*6 + 1);
dice2 = (int)(Math.random()*6 + 1);

System.out.println(dice1);
System.out.println(dice2);



utility.addition(dice1,dice2);
scanner.close();
	}

}
