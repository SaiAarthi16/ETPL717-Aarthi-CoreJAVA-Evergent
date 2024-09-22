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

public class Queue_ArrayDeque9_Poll {
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
		
		System.out.println(aq.poll());
		System.out.println(aq.pollLast());
		System.out.println(aq.pollFirst());
		/*
		System.out.println(aq);
		System.out.println(aq.remove());
		System.out.println(aq.removeLast());
		System.out.println(aq.removeFirst());
		*/
	}
}
