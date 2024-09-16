package com.spr.pack;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spr.pack")
public class CollegeConfig {

//	@Bean
//	//@Qualifier("Faculty")
//	public Faculty getfaculty() {
//		return new Faculty();
//	}
//}
}