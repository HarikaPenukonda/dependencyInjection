package com.seleniumexpress.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
		College college = context.getBean("collegeBean",College.class);
		System.out.println("The college object is created " + college);

	}

}
