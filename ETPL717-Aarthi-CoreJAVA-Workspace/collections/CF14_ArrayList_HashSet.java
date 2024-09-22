package com.evergent.corejava.collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
public class CF14_ArrayList_HashSet {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("CoreJAVA");
		list.add("J2EE");
		list.add("J2SE");
		list.add("MyJAVA");
		System.out.println(list);
		
		Set<String> s=new HashSet<String>();
		s.addAll(list);
		System.out.println(s);
		
		Set<String> s1=new HashSet<String>();
		s1.add("CoreJAVA");
		s1.add("J2EE");
		s1.add("J2SE");
		s1.add("MyJAVA");
		s1.add("CoreJAVA");
		//s1.add("Hello");
		
		if(s.equals(s1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		//Return true if this set contains All of the elements of the specified collection.
		//If the specified collection is also a set, this method returns true
		System.out.println(s.containsAll(s1));
	}
}
