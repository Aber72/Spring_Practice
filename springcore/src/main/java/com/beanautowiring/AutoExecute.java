package com.beanautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoExecute {

	public static void main(String[] args) {
		 
		ApplicationContext context=
		new ClassPathXmlApplicationContext("springauwr.xml");
		
		Emp emp= (Emp) context.getBean("employee");
		
		System.out.println(emp);

	}

}
