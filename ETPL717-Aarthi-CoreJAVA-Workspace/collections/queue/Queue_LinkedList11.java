package com.evergent.corejava.collections.queue;

import java.util.LinkedList;
import java.util.Deque;

public class Queue_LinkedList11 {
	public static void main(String[] args) {
		Deque<String> ql=new LinkedList<>();
		ql.add("Klaus");
		ql.add("Katherine");
		ql.add("Damon");
		ql.add("Hope");
		System.out.println(ql);
		
		System.out.println(ql.size());
		boolean t=ql.isEmpty();
		System.out.println(t);
		
		ql.clear();
		System.out.println(ql);
	}
}
