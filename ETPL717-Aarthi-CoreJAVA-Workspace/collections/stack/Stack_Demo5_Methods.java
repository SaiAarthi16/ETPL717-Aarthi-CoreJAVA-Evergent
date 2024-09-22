package com.evergent.corejava.collections.stack;
import java.util.Stack;
public class Stack_Demo5_Methods {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.push("Date");
		
		//Displaying the stack
		System.out.println("Stack : "+stack);
		
		//peeking at the top element
		String topElement=stack.peek();
		System.out.println("Top Element : "+topElement);
		
		//Popping an element from the stack
		String removedElement=stack.pop();
		System.out.println("Popped Element: "+removedElement);
		
		//Displaying the stack after popping
		System.out.println("Stack after pop : "+stack);
		System.out.println("-----------------------");
		
		//Checking if the stack is empty
		boolean isEmpty=stack.isEmpty();
		System.out.println("Is the stack Empty?"+isEmpty);
		
		int position= stack.search("Banana");
		if(position!=-1)
			System.out.println("Position of 'Banana' from top: "+position);
		else
			System.out.println("Banana is not in the stack");
		//clearing the stack
		stack.clear();
		System.out.println("Stack after clearing: "+stack);
	}
}
