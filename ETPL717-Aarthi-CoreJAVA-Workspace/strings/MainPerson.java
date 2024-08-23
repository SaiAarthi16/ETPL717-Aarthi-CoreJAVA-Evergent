package com.evergent.corejava.strings;
/*
 The PersonImmutable class is immutable because once an instance is created, 
 the name and age cannot be changed.
 */
public class MainPerson {

	public static void main(String[] args) {
		PersonImmutable person=new PersonImmutable("Klaus",50);
		System.out.println("Name: "+person.myName());
		System.out.println("Age: "+person.myAge());
	}
}
