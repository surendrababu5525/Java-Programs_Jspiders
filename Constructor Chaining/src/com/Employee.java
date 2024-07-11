package com;

class Employee {

	Employee(int id){
        this(50000.0);
		System.out.println("ID: "+id);
	}

	Employee(String name,int age){
		
		System.out.println("Name: "+name+" Age: "+age);
	}

	Employee(double salary){
		this("Sam",22);
		System.out.println("Salary"+salary);
	}

	public static void main(String[] args) {

		Employee e= new Employee(105);
		// new Employee(105);
	}

}
