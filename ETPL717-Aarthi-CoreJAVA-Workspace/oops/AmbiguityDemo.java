package com.evergent.corejava.oops;
class AmbiguityDemo {  
    void print(int x) {  
        System.out.println("Printing integer: " + x);  
    }  
    void print(double y) {  
        System.out.println("Printing double: " + y);  
    }  
    public static void main(String[] args) {  
        AmbiguityDemo demo = new AmbiguityDemo();  
        demo.print(5);  
    }  
} 
