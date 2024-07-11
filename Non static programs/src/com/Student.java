package com;

// Accessing non static members in the same class
class Student {

	String name="Tom"; // non-static variable

	void study() // non-static method
	{
		System.out.println("Studying java");
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Name: "+s.name);
		s.study();
	}
}
