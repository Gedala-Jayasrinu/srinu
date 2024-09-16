package com.student.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student implements College{
	@Autowired
	private Subject sub;
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public void disp(){
		System.out.println("Welcome Student"+" "+sub);
	}
}
