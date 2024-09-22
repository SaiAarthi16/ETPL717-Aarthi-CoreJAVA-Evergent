package com.evergent.corejava.collections.map;
import java.util.HashMap;
public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap mymap=new HashMap();
		mymap.put("200", "Bhanu");
		mymap.put("300", "Abbas");
		mymap.put(null, "abc");
		mymap.put(700, null);
		mymap.put(800, null);
		mymap.put(null, null);
		System.out.println(mymap);
	}
}
