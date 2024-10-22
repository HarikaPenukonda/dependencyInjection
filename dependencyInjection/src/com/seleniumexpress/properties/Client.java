package com.seleniumexpress.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beansThree.xml");
		Student student = (Student)context.getBean("admin");
		student.displayInfo();

	}

}
