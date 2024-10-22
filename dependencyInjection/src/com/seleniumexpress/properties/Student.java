package com.seleniumexpress.properties;

public class Student {
	
	private String studentName;
	private String interestedCourse;
	private String hobby;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayInfo() {
		System.out.println("Student name : " + studentName);
		System.out.println("Student is interested in : " + interestedCourse);
		System.out.println("Student hobbies are : " + hobby);
	}

}
