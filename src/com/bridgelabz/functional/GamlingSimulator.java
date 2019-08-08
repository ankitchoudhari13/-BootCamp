package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GamlingSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
Utility utility=new Utility();

int stake,goal,number;


System.out.println("enter the goal");
goal=scanner.nextInt();

System.out.println("enter the  stake amount");
stake=scanner.nextInt();

System.out.println("enter the number time goal");
number=scanner.nextInt();
utility.game(goal,stake,number);
scanner.close();

	}

}
