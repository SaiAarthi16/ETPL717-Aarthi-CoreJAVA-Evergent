package com.evergent.corejava.generalprogramming;
import java.util.Scanner;

public class Myname1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers as A, B and C");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("A is Big");
		else if(b>a && b>c)
			System.out.println("B is Big");
		else
			System.out.println("C is Big");
	}
}
