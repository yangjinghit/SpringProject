package com.yangjing.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangjing.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student);
	}
}
