package com.evergent.corejava.strings;

public class ContainsSubstring {
	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog.";
		String substr="fox";
		boolean contains=str.contains(substr);
		System.out.println("Contains '"+substr+"' :"+contains);
	}
}
