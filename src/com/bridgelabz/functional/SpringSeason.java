package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	



int month = Integer.parseInt(args[0]);
int day   = Integer.parseInt(args[1]);

boolean Spring =  ( month == 3 && day >= 20 && day <= 31)
|| (month == 4 && day >=  1 && day <= 30)
|| (month == 5 && day >=  1 && day <= 31)
|| (month == 6 && day >=  1 && day <= 20);

	System.out.println(Spring);




	}

}
