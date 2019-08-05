package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
 
public class PrintThreeNumber 
{
   public static void main(String[] args) 
    {
     Scanner scanner=new Scanner(System.in);
     Utility utility=new Utility();
      String str1;
      String str2="hii";
      System.out.println("enter the string");
      str1=scanner.next();
      
      utility.revrse(str1,str2);
    	
        scanner.close();
    }
}