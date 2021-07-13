package assignment01;
import java.util.*;
public class AvgScore {

	public static void main(String[] args)
	{ 
	   Scanner s = new Scanner(System.in);
	 
	   int marksOfS1[]=new int[3];
	   int marksOfS2[]=new int[3];
	   int marksOfS3[]=new int[3];
	   
	   System.out.println("Enter marks of student 1 in the 3 subjects");
	   for(int i = 0; i < marksOfS1.length; i++)
	   {
		   marksOfS1[i]=s.nextInt();
	   }
	   System.out.println("Enter marks of student 2 in the 3 subjects");
	   for(int i = 0; i < marksOfS2.length; i++)
	   {
		   marksOfS2[i]=s.nextInt();
	   }
	   System.out.println("Enter marks of student 3 in the 3 subjects");
	   for(int i = 0; i < marksOfS3.length; i++)
	   {
		   marksOfS3[i]=s.nextInt();
	   }
	   int total1 = 0, total2 = 0, total3 = 0, avg1, avg2, avg3;
	   
	   for(int i = 0; i<marksOfS1.length; i++)
	   {
		   total1 += marksOfS1[i];
	   }
	   for(int i = 0; i<marksOfS2.length; i++)
	   {
		   total2 += marksOfS2[i];
	   }
	   for(int i = 0; i<marksOfS3.length; i++)
	   {
		   total3 += marksOfS3[i];
	   }
	   avg1 = total1 / marksOfS1.length;
	   avg2 = total2 / marksOfS2.length;
	   avg3 = total3 / marksOfS3.length;
	   
	   System.out.println("Marks of Student1 is: Total = " + total1 + " Average = " + avg1);
	   System.out.println("Marks of Student2 is: Total = " + total2 + " Average = " + avg2);
	   System.out.println("Marks of Student3 is: Total = " + total3 + " Average = " + avg3);
	   
	   for(int i = 0; i < marksOfS1.length; i++)
	   {
		   int marksInSubjects = 0;
		   marksInSubjects = (marksOfS1[i] + marksOfS2[i] + marksOfS3[i]);
		   int averageInSubjects = marksInSubjects / marksOfS1.length;
		   System.out.println("Total marks of students in subject"+ " is "+ marksInSubjects + " and average is " +averageInSubjects);
		   
	   }
	   
	   s.close();
	   
	   
       
	}

}
