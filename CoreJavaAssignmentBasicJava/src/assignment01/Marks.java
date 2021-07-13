package assignment01;

import java.util.Scanner;

public class Marks
{
	public static void main(String args[])
	{
		
		float s1,s2,s3;
		
		Scanner s=new Scanner (System.in);
		System.out.println("Enter marks of first subject");
		s1=s.nextFloat();
		System.out.println("Enter marks of second subject");
		s2=s.nextFloat();
		System.out.println("Enter marks of third subject");
		s3=s.nextFloat();
	 
		if(s1>60 && s2>60 && s3>60)
		{
		System.out.println("Student has passed");
		}
		else if(s1>60 && s2>60 || s2>60 && s3>60 || s1>60 && s3>60 )
		{
		System.out.println("Student has promoted");
		}
		else 
		{
		System.out.println("Student has fail");
		}
       s.close();
    }
}
