package com;
// Accessing public members in different class
// and same package
public class EmployeeMainClass {
	public static void main(String[] args) {

		System.out.println("ID is: "+Employee.id);
		Employee emp=new Employee();
		emp.work();
	}
}
