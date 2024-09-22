package com.evergent.corejava.collections.map;
import java.util.*;
/*
 * Sorted order: TreeMap maintains its elements in ascending order of keys.
 * In this, Student IDs are sorted, so when we print the TreeMap,
 * IDs are in ascending order.
 */
public class TreeMapDemo4 {
	public static void main(String[] args) {
		//creating a TreeMap to store student records
		TreeMap<Integer, String> sr=new TreeMap<>();
		//Adding student records to the TreeMap
		sr.put(102, "Raju");
		sr.put(101, "Bhanu");
		sr.put(103, "Ramu");
		sr.put(104, null);
		sr.put(106, null);
		sr.put(105, "aaa");
		System.out.println(sr);
		//Display the TreeMap(sorted by Student ID)
		System.out.println("Student Records (sorted by ID) : ");
		for(Map.Entry<Integer, String> entry : sr.entrySet()) {
			System.out.println("ID : "+entry.getKey()+", Name : "+entry.getValue());
		}
	}
}
