package com.spr.pack;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class StudentConfig {
	@Bean
	@Qualifier("Student")
	public  Student getstudent() {
		return new Student();
	}

}
