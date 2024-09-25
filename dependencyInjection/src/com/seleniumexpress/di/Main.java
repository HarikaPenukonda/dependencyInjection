package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = context.getBean("ms",Employee.class);
		Employee emp2 = context.getBean("km",Employee.class);
		emp1.displayEmployeeInfo();
		emp2.displayEmployeeInfo();
//		Student s1 = context.getBean("harika",Student.class);
//		Student s2 = context.getBean("admin",Student.class);
//		s1.displayInfo();
//		s2.displayInfo();
	}

}
