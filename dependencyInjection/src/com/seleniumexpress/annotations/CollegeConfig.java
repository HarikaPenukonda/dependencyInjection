package com.seleniumexpress.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.seleniumexpress.annotations")
public class CollegeConfig {
	
//	@Bean("colBean")
//	public College collegeBean() {
//		College college = new College();
//		return college;
//	}

}
