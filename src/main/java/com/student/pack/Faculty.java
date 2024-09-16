package com.student.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Fac")
public class Faculty implements College{
	@Autowired
	private Subject sub;
	
	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public void disp(){
		System.out.println("Welcome Faculty"+" "+sub);
	}
}
