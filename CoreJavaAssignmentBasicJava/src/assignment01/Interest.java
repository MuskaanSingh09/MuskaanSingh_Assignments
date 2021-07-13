package assignment01;

import java.util.Scanner;

public class Interest 
{
public static void main(String args[])
{
	
	double p,r,t,SI,CI;
	
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the principle amount");
	p=s.nextFloat();
	System.out.println("Enter the rate of interest");
	r=s.nextFloat();
	System.out.println("Enter the no. of years");
	t=s.nextFloat();
	SI=(p*r*t)/100;
	CI= p* Math.pow(1.0 + r/100.0,t)-p;
	System.out.println("Simple Interest = "+SI);
	System.out.println("Compound Interest = "+CI);
	
	s.close();
	
			
}
}
