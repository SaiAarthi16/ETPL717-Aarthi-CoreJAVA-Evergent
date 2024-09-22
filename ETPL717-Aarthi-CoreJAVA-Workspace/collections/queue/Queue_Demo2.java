package com.evergent.corejava.collections.queue;
import java.util.PriorityQueue;
import java.util.Queue;
//Addition: offer(), add()
//Retrieval: peek()
//Remove: poll, remove()
public class Queue_Demo2 {
	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
