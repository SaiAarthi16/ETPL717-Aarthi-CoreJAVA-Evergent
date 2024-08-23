package com.evergent.corejava.exceptionhandling;
//Heap Error
public class MyOutofMemory17 {

	public static void main(String[] args) {
		Integer[] array=new Integer[100000000*100000000];
		System.out.println(array);
	}
}
