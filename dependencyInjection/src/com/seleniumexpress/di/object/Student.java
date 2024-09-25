package com.seleniumexpress.di.object;

public class Student {
	
	private int id;
	
	private MathCheat mathCheat; // null

	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void display() {
		mathCheat.cheating();
		System.out.println("my id is : " + id);
	}

}
