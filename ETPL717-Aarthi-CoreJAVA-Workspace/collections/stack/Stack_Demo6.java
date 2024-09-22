package com.evergent.corejava.collections.stack;
import java.util.Stack;
import java.util.Enumeration;
import java.util.Iterator;
public class Stack_Demo6 {
	public static void main(String[] args) {
		Stack<String> mystack=new Stack<>();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");

		System.out.println(mystack);
		System.out.println("Enumeration Iteration");
		Enumeration e=mystack.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator...");
		Iterator i1=mystack.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("forEach Adv loop");
		for(String s : mystack)
			System.out.println(s);
	}
}
