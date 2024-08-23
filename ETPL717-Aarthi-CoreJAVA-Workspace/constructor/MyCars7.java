package com.evergent.corejava.constructor;
class Car{
	String color;
	int maxSpeed;
	
	//Default Constructor
	Car(){
		color="White";
		maxSpeed=120;
	}
	
	//Parameterized Constructor
	Car(String color, int maxSpeed){
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void display() {
		System.out.println("Color: "+color);
		System.out.println("Max Speed: "+maxSpeed);
	}
}
public class MyCars7 {

	public static void main(String[] args) {

		//Creating objects with different Constructors
		Car car1=new Car();
		Car car2=new Car("Red",150);
		car1.display();
		car2.display();
	}
}
