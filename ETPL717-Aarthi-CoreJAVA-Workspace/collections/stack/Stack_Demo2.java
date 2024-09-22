package com.evergent.corejava.collections.stack;
//peek() : last element value is showing
import java.util.Stack;
public class Stack_Demo2 {
	public static void main(String[] args) {
		Stack mystack=new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println(mystack.peek());
		System.out.println(mystack);
	}
}
