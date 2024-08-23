package com.evergent.corejava.generalprogramming;
import java.util.*;

public class Myname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers as A and B");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println("A is Big");
		else
			System.out.println("B is Big");
	}

}
