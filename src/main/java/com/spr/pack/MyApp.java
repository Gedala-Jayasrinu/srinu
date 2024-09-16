package com.spr.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	  public static void main(String[] args) {
	      
			ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
	        Collinter obj = (Collinter) context.getBean(Subject.class);
	        obj.disp();
//	        System.out.println(obj);
}
}
