package com.evergent.corejava.wrapperclasses;
public class WrapperClassesDemo2 {

	public static void main(String[] args) {
		float f1=4.5f;
		
		int i1=100;
		Integer i2=new Integer(i1);
		int i3=i2.intValue();
		
		double d1=799.89;
		Double d2=new Double(d1);
		double d3=d2.doubleValue();
		
		byte b1=10;
		Byte b2=new Byte(b1);
		byte b3=b2.byteValue();
		
		System.out.println("int value is: "+i1);
		System.out.println("Int Object Values is: "+i2);
		System.out.println("Convert Integer object value to primitive: "+i3);
		
		System.out.println("double value is: "+d1);
		System.out.println("Double Object Values is: "+d2);
		System.out.println("Convert Double object value to primitive: "+d3);
		
		System.out.println("byte value is: "+b1);
		System.out.println("Byte Object Values is: "+b2);
		System.out.println("Convert Byte object value to primitive: "+b3);
	}
}
