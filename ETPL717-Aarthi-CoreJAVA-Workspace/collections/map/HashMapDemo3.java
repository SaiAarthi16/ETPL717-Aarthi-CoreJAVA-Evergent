package com.evergent.corejava.collections.map;
import java.util.HashMap;
public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String, String> cc=new HashMap<>();
		cc.put("India", "Delhi");
		cc.put("USA", "Washington DC");
		cc.put("Germany", "Berlin");
		//cc.put("India", "Delhi");
		System.out.println(cc);
		
		for(String i : cc.keySet()) {
			System.out.println(i);
		}
	}
}
