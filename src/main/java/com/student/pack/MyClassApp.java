package com.student.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MyClassApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Faculty obj = (Faculty) context.getBean("Fac");
        obj.disp();
//        System.out.println(obj);
    }
}

