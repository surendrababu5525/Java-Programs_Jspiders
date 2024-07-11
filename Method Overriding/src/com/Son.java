package com;

public class Son extends Father{

	@Override // annotation Override
	void bike()
	{
		System.out.println("New fashioned sons bike");
	}
	public static void main(String[] args) {

		Son s= new Son();
		s.bike();
	}

}
