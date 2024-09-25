package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = context.getBean("harika",Student.class);
		Student s2 = context.getBean("admin",Student.class);
		s1.displayInfo();
		s2.displayInfo();
	}

}
