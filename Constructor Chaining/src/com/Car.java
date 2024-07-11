package com;

class Car {

	Car(int x)
	{
		System.out.println("1");
	}

	Car()
	{
		this(100);
		System.out.println("2");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Car c = new Car();
		System.out.println("End");
	}
}
