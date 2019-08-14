package com.bridgelabz.functional;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);

int head;
int tail;
int total;

System.out.println("enter the number");
head=scanner.nextInt();
tail=scanner.nextInt();
total=scanner.nextInt();


float per = (head*100)/total;

float perrrr=(tail*100)/total;

if(per>perrrr) {
	System.out.println(head);
	
}
else {System.out.println(tail);}
scanner.close();


}
}