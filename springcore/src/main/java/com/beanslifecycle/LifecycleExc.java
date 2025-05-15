package com.beanslifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleExc {

	public static void main(String[] args) {
		ApplicationContext context=
		new ClassPathXmlApplicationContext("springlfc.xml");
		Lifecycle lifecycle=
		(Lifecycle) context.getBean("lifecycle");
		
		System.out.println(lifecycle);
		((AbstractApplicationContext) context).registerShutdownHook();
		
		System.out.println("-------------------------------------------");
		
		Pepsi pepsi = (Pepsi) context.getBean("pep");
		System.out.println("pepsi");

	}

}
