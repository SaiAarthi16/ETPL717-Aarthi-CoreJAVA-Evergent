package com.evergent.corejava.collections.queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo4_isEmpty {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
