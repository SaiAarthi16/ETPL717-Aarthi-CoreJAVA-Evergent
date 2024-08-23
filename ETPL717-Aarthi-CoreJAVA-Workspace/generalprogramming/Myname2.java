package com.evergent.corejava.generalprogramming;

import java.util.Scanner;

public class Myname2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers as A, B, C, D and E");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		if(a>b && a>c && a>d && a>e)
			System.out.println("A is Big");
		else if(b>a && b>c && b>d && b>e)
			System.out.println("B is Big");
		else if(c>a && c>b && c>d && c>e)
			System.out.println("C is Big");
		else if(d>a && d>b && d>c && d>e)
			System.out.println("D is Big");
		else
			System.out.println("E id Big");
	}

}
