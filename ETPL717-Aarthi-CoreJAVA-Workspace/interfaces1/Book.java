package com.evergent.corejava.interfaces1;
/* 
   1. Interface is a Keyword.
   2. We can declare method signature only but not implementation.
   3. By default all interface methods are abstract.
   6. We can declare variables inside interface.
   7. All interface variables are by default public, final and static
 */
public interface Book {
	
	String cname="India";
	
	public void bookTitle();
	public void bookAuthor();
	public void bookPrice();
}
