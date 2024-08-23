package com.evergent.corejava.generalprogramming;
enum Color{
	RED, GREEN, BLUE;
}
enum News{
	North, East, West, South;
}
enum AbcProducts{
	Laptops, Desktops, Tabs;
}
enum Days{
	Mon, Tues, Wed, Thu, Fri, Sat, Sunday;
}
public class EnumColorsExample {
	public static void main(String[] args) {
		Color c=Color.RED;
		System.out.println(c);
		News n=News.North;
		System.out.println(n);
		AbcProducts a=AbcProducts.Laptops;
		System.out.println(a);
		Days d=Days.Sunday;
		System.out.println(d);
	}
}
