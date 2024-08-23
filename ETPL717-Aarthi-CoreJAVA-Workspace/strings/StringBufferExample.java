package com.evergent.corejava.strings;
/*
-append(): adds a String to the end of the current String.
-insert(): adds a String at a specific position in the current String.
-replace(): replaces a substring with a new String.
-delete(): removes a substring from the current String.
-reverse(): reverses the order of characters in the current String.
-capacity(): returns the current capacity of the buffer.
-length(): returns the current length of the String.
 */
public class StringBufferExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Intial String: "+sb);	
		//Append a String
		sb.append("World!");
		System.out.println("After Append: "+sb);	
		//Insert a String at a specific position.
		sb.insert(6, "Beautiful");
		System.out.println("After insert: "+sb);		
		//Replace a Substring
		sb.replace(0, 5, "hi");
		System.out.println("After Replace: "+sb);
		//Delete a substring
		sb.delete(0, 3);
		System.out.println("After Delete: "+sb);
		//Reverse the String
		sb.reverse();
		System.out.println("After Reverse: "+sb);	
		//capacity & length
		System.out.println("capacity: "+sb.capacity());
		System.out.println("length: "+sb.length());
		}
}
