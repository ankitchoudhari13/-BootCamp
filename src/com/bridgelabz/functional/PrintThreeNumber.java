package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
 
public class PrintThreeNumber 
{
   public static void main(String[] args) 
    {
    
      String s[]="wardha mumbai pune".split("");
      String a="";
      for (int i = s.length-1; i >= 0; i--) {
    	a+=s[i]+"";
      }
      System.out.println("hi");
      System.out.println(a.substring(0,a.length()-1));
      
    }
}