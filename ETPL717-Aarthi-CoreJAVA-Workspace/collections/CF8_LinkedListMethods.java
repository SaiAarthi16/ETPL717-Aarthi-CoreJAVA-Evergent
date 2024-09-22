package com.evergent.corejava.collections;
import java.util.LinkedList;

public class CF8_LinkedListMethods {
	public static void main(String[] args) {
		//Create linked list of strings
		LinkedList fruits=new LinkedList();
		
		//Add elements to the LinkedList
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Dates");
		
		//Display the LinkedList
		System.out.println("Initial LinkedList: "+fruits);
		
		//Add an element at the beginning
		fruits.addFirst("Mango");
		System.out.println("After adding first element: "+fruits);
		
		//Add an element at the end
		fruits.addLast("Orange");
		System.out.println("After adding first element: "+fruits);
		
		//Access Elements by Index
		System.out.println("Element at index 2: "+fruits.get(2));
		
		//Remove the first and last elements
		fruits.removeFirst();
		System.out.println("After removing first element: "+fruits);
		
		fruits.removeLast();
		System.out.println("After removing last element: "+fruits);
		
		//Check if the LinkedList contains a specific element
		System.out.println("Conatins 'Banana'? "+fruits.contains("Banana"));
		
		//Remove an element by value
		fruits.remove("Banana");
		System.out.println("After removing 'Banana': "+fruits);
		
		//Get the size of the linkedlist
		System.out.println("Size of the LinkedList: "+fruits.size());
		
		//clear the linkedlist
		fruits.clear();
	}
}
