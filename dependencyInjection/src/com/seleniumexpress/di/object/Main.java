package com.seleniumexpress.di.object;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		MathCheat cheat = new MathCheat(); // providing reference
		student.display(cheat);	// NullPointerException as mathCheat is not reference

	}

}
