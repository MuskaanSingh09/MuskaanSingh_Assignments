package com.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/assignment2/Ques.xml");
		QuestionList question1 = (QuestionList) context.getBean("QuestionList");
	    System.out.println(question1);
	    
	    ApplicationContext context1 = new ClassPathXmlApplicationContext("com/assignment2/Ques.xml");
		QuestionMap question2 = (QuestionMap) context.getBean("QuestionMap");
	    System.out.println(question2);
	    
	    ApplicationContext context2 = new ClassPathXmlApplicationContext("com/assignment2/Ques.xml");
		QuestionSet question3 = (QuestionSet) context.getBean("QuestionSet");
	    System.out.println(question3);
	    
	}

}
