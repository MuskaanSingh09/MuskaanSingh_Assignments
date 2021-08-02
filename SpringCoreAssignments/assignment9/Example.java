package com.assignment9;

public class Example 
{
  private String Subject;

public String getSubject() 
{
	return Subject;
}

public void setSubject(String subject) 
{
	Subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() 
{
	return "Example [Subject=" + Subject + "]";
}
  
  public void init()
  {
	System.out.println("starting method");  
  }
 
  public void destroy()
  {
	System.out.println("ending method");  
  }
  
}

