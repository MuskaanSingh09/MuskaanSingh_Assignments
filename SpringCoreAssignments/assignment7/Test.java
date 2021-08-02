package com.assignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/assignment7/config.xml");
		Example e=(Example) context.getBean("Example");
		System.out.println(e);

	}

}
