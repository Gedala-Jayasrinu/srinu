package com.spr.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Faculty implements Collinter  {
@Autowired
		public void disp(){
			System.out.println("Welcome Faculty");
		}
	}

