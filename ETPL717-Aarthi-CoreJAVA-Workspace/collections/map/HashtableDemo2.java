package com.evergent.corejava.collections.map;
import java.util.Hashtable;
public class HashtableDemo2 {
	public static void main(String[] args) {
		Hashtable mymap=new Hashtable();
		mymap.put("200", "Bhanu");
		mymap.put("300", "Abbas");
		mymap.put("400", "Ravi");
		//mymap.put(null, "abc");
		//mymap.put(700, null);
		mymap.put("400", "Ravi");

		System.out.println(mymap);
	}
}
