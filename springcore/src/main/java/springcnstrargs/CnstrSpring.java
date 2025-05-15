package springcnstrargs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CnstrSpring {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("springcr.xml");
		
		Person person =(Person) context.getBean("person");
		System.out.println(person);
	}

}
