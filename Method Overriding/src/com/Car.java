package com;

public class Car extends Vehicle{

	void start()
	{   
		super.start(); //Vehicle Started
		System.out.println("Car Started");
		super.start(); //Vehicle Started
	}
}
