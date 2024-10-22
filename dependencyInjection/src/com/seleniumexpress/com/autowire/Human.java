package com.seleniumexpress.com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octopusHeart")
	public Heart heart;

	public void pumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("The name is " + heart.getNameOfAnimal() + " has " + heart.getNoOfHeart() + " hearts");
		}else {
			System.out.println("You are dead");
		}
	}

}
/*	No need to write setter if we are using @Autowire before dependency
 * If the match found "humanHeart" in the beans.xml then directly 
 * create "humanHeart" object and inject that to the dependency Heart 
 * First it resolves using byType and then byName
 * */
