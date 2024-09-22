package com.evergent.corejava.collections;
import java.util.HashSet;
import java.util.Iterator;

public class CF11_HashSet_Generics {
	public static void main(String[] args) {
		HashSet<String> mySet=new HashSet<String>();
		//mySet.add(100);
		mySet.add("Hello");
		//mySet.add(45.5);
		//mySet.add(100);
		mySet.add("Welcome");
		mySet.add("Hello");
		System.out.println(mySet);
		
		Iterator i=mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String s:mySet) {
			System.out.println(s);
		}
	}
}
