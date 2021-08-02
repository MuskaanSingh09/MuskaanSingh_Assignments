package com.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test 
{
	@Bean
   public static void main(String[] args)
   {
	   ApplicationContext context = new ClassPathXmlApplicationContext("com/assignment4/autoconfig.xml");
		Emp emp1= context.getBean("emp1", Emp.class);
		System.out.println(emp1);
   }
}
