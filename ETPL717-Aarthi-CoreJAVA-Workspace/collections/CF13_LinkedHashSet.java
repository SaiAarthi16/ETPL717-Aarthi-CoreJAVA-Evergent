package com.evergent.corejava.collections;
import java.util.LinkedHashSet;
import java.util.Iterator;
//LinkedHashSet is a subclass of Hashset that maintains the insertion order of elements.
//This mean that elements are added and retrieved in the same order as they were inserted.
//Insertion Order: Elements are stored and retrieved in the order they were added.
public class CF13_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Grapes");
		//Displaying the LinkedHashSet 
		System.out.println("LinkedHashSet: "+linkedHashSet);
		//Iterating through the LinkedHashSets
		System.out.println("Iterating over LinkedHashSet: ");
		for(String fruit:linkedHashSet) {
			System.out.println(fruit);
		}
		//Checking if the set contains an element: Returns true if this set contains the specified element. 
		System.out.println("Conatins 'Mango' ? "+linkedHashSet.contains("Mango"));
		linkedHashSet.remove("Banana");
		System.out.println("After removing : "+linkedHashSet);
		System.out.println("Size: "+linkedHashSet.size());
		linkedHashSet.clear();
		System.out.println("After clearing: "+linkedHashSet);
	}
}
