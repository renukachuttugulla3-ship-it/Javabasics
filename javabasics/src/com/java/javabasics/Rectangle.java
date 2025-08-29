package com.java.javabasics;

public class Rectangle {
	
	//Rectangle r= new  Rectangle();
	//objects are created from the constructor
	int width, height;
	
	//default constructor
	public Rectangle () {
		//no return
		
	}
	
	//arguments constructor: w,h
	public Rectangle(int width ,int height) {
		this.width = width;
		this.height = height;
		
	}
	public int getwidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,10); 
		r.setHeight(20);
		r.setWidth(20);
		
		System.out.println(r.getHeight());
		System.out.println(r.getwidth());
	}

}
