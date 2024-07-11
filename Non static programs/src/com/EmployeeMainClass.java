package com;

//Accessing the non static members of the other class
class EmployeeMainClass {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println("id is: "+e.id);
		e.work();
	}
}
