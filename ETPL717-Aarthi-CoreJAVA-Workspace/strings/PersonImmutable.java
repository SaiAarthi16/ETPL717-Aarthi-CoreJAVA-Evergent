package com.evergent.corejava.strings;
/* 
 	We can create our own immutable class:
 	1. We can declare class as final.
 	2. The class is declared as final so that it cannot be subclassed.
 	Private Final Fields:
 	  The fields name and age are private and final.
 	Constructor:
 	  The constructor initializes the final fields when a person object is created.
 */
public class PersonImmutable {
	private final String name;
	private final int age;
	
	//Constructor to initialize the final fields
	public PersonImmutable(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge(){
		return age;
	}
}
