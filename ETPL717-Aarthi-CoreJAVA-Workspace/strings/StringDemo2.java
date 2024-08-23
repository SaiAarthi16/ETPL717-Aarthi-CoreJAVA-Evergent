package com.evergent.corejava.strings;
public class StringDemo2 {	
	public static void main(String[] args) {
		String s1="JAVA";
		String s2="JAVA";
		if(s1==s2)
			System.out.println("True");
		else
			System.out.println("False");
		
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
