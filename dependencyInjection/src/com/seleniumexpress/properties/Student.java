package com.seleniumexpress.properties;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String studentName;
	private String interestedCourse;
	private String hobby;
	
	@Value("Admin")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Value("Spring-framework")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	@Value("Coding")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayInfo() {
		System.out.println("Student name : " + studentName);
		System.out.println("Student is interested in : " + interestedCourse);
		System.out.println("Student hobbies are : " + hobby);
	}

}
