package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_ArrayDeque6 {
	public static void main(String[] args) {
		ArrayDeque<String> aq=new ArrayDeque<>();
		aq.add("Klaus");
		aq.add("Katherine");
		aq.add("Damon");
		aq.add("Hope");
		System.out.println(aq);
		System.out.println(aq.peek());
	}
}
