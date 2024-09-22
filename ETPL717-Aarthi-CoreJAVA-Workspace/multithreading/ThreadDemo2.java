package com.evergent.corejava.multithreading;
//Implements Runnable Interface
class MyThread2 implements Runnable{
	public void run() {
		for(int i=0; i<=100; i++)
			System.out.println(i);
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyThread2 m1=new MyThread2();
		Thread t1=new Thread(m1);
		t1.start();
		t1.setPriority(5);
		
		Thread t2=new Thread(m1);
		t2.start();
		t2.setPriority(1);
	}
}
