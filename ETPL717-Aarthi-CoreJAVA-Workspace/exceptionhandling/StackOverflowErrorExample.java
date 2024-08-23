package com.evergent.corejava.exceptionhandling;

public class StackOverflowErrorExample {

	public static void main(String[] args) {
		try {
			recursiveMethod();//start the recursive method
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverflowError Caught: "+e.getMessage());
		}
	}
	public static void recursiveMethod() {
		recursiveMethod();
	}
}
