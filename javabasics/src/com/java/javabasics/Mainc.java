package com.java.javabasics;

public class Mainc {  //polymorphism eaxmple

	public static void main(String[] args) {
		//runtime polymorphism
		Animal a;
		
		a=new Dog();
		a.sound ();    //Dog bark
		  
		a= new Cat();
		a.sound();    //meow
		
		Calculator calc =new Calculator ();
		System.out.println("sum (int): " + calc.add(5, 10));
		System.out.println("sum (double): " + calc.add(5.5, 2.5));

	}

}
