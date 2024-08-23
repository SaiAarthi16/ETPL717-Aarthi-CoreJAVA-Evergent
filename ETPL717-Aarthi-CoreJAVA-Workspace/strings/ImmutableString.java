package com.evergent.corejava.strings;
public class ImmutableString {
	private String value;
	public ImmutableString(String value) {
		this.value=value;
	}
	/* public String myValue(){
		return value;
	} */
	
	public String toString() {
		return value;
	}
}
