package com.evergent.corejava.wrapperclasses;
public class Autoboxing_Unboxing3 {
	//Main driver Method
	public static void main(String[] args) {
		//Creating an Integer Object
		//With custom value say it be 10
		int a=10;
		Integer i=new Integer(a);
		
		//Unboxing the object
		int i1=i.intValue();
		
		//print statements
		System.out.println("Value of i: "+i.getClass().getName());
		System.out.println("Value of i1: "+i1);
		
		//Autoboxing of character
		char ch1='a';
		Character myc=new Character(ch1);
		
		//Auto-Unboxing of characters
		char ch=myc.charValue();
		
		//print statements
		System.out.println("Value of ch: "+ch1);
		System.out.println("Value of ch: "+myc);
	}
}
