package com.assignment9;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	
	public static void main(String[] args)
	
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/assignment9/config.xml");
		
		
		context.registerShutdownHook();
		
		Example example = (Example) context.getBean("example");
		
		System.out.println(example);
	}

}
