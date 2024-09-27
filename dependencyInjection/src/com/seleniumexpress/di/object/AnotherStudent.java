package com.seleniumexpress.di.object;

public class AnotherStudent {
	
	private int id;
	
	private MathCheat mathCheat;
	
	public AnotherStudent() {
		System.out.println("Another student constructor is called");
	}

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
