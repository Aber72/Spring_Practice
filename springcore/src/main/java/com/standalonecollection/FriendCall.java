package com.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FriendCall {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("standalonecln.xml");
		
		Bestfriends bestfriends= (Bestfriends) context.getBean("frd1");
		Bestfriends bestfriends1= (Bestfriends) context.getBean("frd");
		
		System.out.println(bestfriends);
		System.out.println(bestfriends1);
		
	}

}
