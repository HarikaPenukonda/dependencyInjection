package com.seleniumexpress.com.autowire;

public class Human {
	
	public Heart heart;
	
	public Human(Heart heart) {
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void pumping() {
		if(heart != null) {
			heart.pump();
		}else {
			System.out.println("You are dead");
		}
	}

}
