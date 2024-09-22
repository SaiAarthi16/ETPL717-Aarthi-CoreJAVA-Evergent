package com.evergent.corejava.collections;
import java.util.HashSet;

public class CF2_HashSetDemo2 {
	public static void main(String[] args) {
		HashSet mySet=new HashSet();
		mySet.add(100);
		mySet.add("Hello");
		mySet.add(45.5);
		mySet.add(100);
		System.out.println(mySet);
	}
}
