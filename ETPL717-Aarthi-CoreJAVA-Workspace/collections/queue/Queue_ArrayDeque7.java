package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;
/* 
 * Addition: offer(), offerFirst(), offerLast()
 * 			 add, addFirst(), addLast()
 * Retrieval: peek(), peekFirst(), peekLast()
 * Removal: poll, pollFirst, pollLast,
 * 			remove(), removeFirst, removeLast()
 */

public class Queue_ArrayDeque7 {
	public static void main(String[] args) {
		ArrayDeque<String> aq=new ArrayDeque<>();
		aq.add("Katherine");
		aq.addFirst("Klaus");
		aq.add("Damon");
		aq.addLast("Hope");
		aq.addFirst("Kai");
		aq.offer("Max");
		aq.addLast("Stephan");
		System.out.println(aq);
		
		System.out.println(aq.size());
		boolean t=aq.isEmpty();
		System.out.println(t);
		
		aq.clear();
		System.out.println(aq);
	}
}
