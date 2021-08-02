package com.assignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/assignment10/config.xml");
		Triangle triangle = (Triangle) context.getBean("pointA");
		Triangle triangle1 = (Triangle) context.getBean("pointB");
		Triangle triangle2 = (Triangle) context.getBean("pointC");
		
		
		System.out.println(triangle);
		System.out.println(triangle1);
		System.out.println(triangle2);
		

	}

}
