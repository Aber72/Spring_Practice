package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		System.out.println("Hello world");
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Student student1 =(Student) context.getBean("student");
		System.out.println(student1);
	}
}