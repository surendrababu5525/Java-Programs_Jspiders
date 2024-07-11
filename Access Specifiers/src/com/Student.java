package com;
//Accessing public members in same class
public class Student {

	public static String name="Jhon";
	public int age=22;

	public static void main(String[] args) {
		System.out.println("Name: "+name);
		Student sc=new Student();
		System.out.println("age: "+sc.age);
	}

}
