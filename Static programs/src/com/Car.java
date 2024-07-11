package com;
// Accessing static members inside same class
class Car { 
	
	static String brand="Suzuki"; // static variable

	static void start() // static method
	{
		System.out.println("Car Started");
	}
	
	public static void main(String[] args) {

		System.out.println("Brand: "+Car.brand);
		Car.start();

		System.out.println("Brand: "+brand);// ClassName.brand -> Car.brand
		start(); // ClassName.start -> Car.start
	}

}
