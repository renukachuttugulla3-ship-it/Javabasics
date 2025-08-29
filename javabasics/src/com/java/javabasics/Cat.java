package com.java.javabasics;


public class Cat extends Animal {
	
	    void meow() {
	        System.out.println(name + " is meowing.");
	    }
	    
	    void sound() {
	        System.out.println("Cat meows");//over ride
	    }
	    
	    void sound(int a) {
	    	System.out.println("Sound level is "+ a);// method overloading
	    }
	}



