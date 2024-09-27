package com.seleniumexpress.com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	public Heart heart;
	
	public Human() {

	}

	public Human(Heart heart) {
		this.heart = heart;
	}

	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void pumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("The name is " + heart.getNameOfAnimal() + " has " + heart.getNoOfHeart() + " hearts");
		}else {
			System.out.println("You are dead");
		}
	}

}
