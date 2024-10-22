package com.seleniumexpress.properties;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String studentName;
	@Value("${student.course}")
	private String interestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	
	public void displayInfo() {
		System.out.println("Student name : " + studentName);
		System.out.println("Student is interested in : " + interestedCourse);
		System.out.println("Student hobbies are : " + hobby);
	}

}
