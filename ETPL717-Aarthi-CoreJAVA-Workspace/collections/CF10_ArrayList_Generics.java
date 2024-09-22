package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayList_Generics {
	public static void main(String[] args) {
		ArrayList<Integer> myList=new ArrayList<Integer>();
		myList.add(100);
		//myList.add("Hello");
		//myList.add(45.5);
		myList.add(50);
		myList.add(10);
		myList.add(200);
		System.out.println(myList);
		
		Iterator i=myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(int j : myList) {
			System.out.println(j);
		}
	}
}
