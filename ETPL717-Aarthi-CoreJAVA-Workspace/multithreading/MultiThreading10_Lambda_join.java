package com.evergent.corejava.multithreading;//Second way of Thread Creation 
public class MultiThreading10_Lambda_join  {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1=()-> {
			
		      for(int i=0;i<10;i++) {
				System.out.println("Welcome "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
		}
		};
		
		Runnable r2= ()->{
			
		      for(int i=0;i<20;i++) {
				System.out.println("MyJava "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
		}
		};
			
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t1.join(); // t1 thread has done then goto t2 thread
		t1.sleep(1000);
		t2.start();
		
	}}

