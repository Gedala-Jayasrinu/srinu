package com.spr.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Subject implements Collinter {
	@Autowired
	private Collinter ob;
	
	public Collinter getOb() {
		return ob;
	}

	public void setOb(Collinter ob) {
		this.ob = ob;
	}

	public void disp() {
		System.out.print("This is subject");
	}

}
