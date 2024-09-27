package com.seleniumexpress.di.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		Student student = new Student();
//		MathCheat cheat = new MathCheat(); // providing reference
//		student.display(cheat);	// NullPointerException as mathCheat is not reference
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu = context.getBean("student",Student.class);
		AnotherStudent stu1 = context.getBean("anotherStudent",AnotherStudent.class);
		stu.display();
		stu1.display();

	}

}
