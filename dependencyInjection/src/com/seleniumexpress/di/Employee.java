package com.seleniumexpress.di;

public class Employee {
	
	private String empName;
	
	private String role;

	public Employee(String role) {
		this.role = role;
	}

	public Employee(String empName, String role) {
		this.empName = empName;
		this.role = role;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("Employee name : " + empName + " and the dept is " + role);
	}
	

}
