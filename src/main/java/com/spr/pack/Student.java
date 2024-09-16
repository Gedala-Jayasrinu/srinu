package com.spr.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("Student")
//@Primary
public class Student implements Collinter {
	@Autowired
	public void disp() {
		System.out.println("This is Student");
		}

}
