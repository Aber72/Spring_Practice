package com.refrencebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
	
	public static void main(String[] args) {
		ApplicationContext context=
		new ClassPathXmlApplicationContext("springref.xml");
		A temp=(A) context.getBean("a");
		System.out.println(temp);
	}

}
