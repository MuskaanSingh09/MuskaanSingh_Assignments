package assignment01;
import java.util.Scanner;
public class User 
{

	public static void main(String[] args)
	{
	   String user_id, password; 
	   int i;
	   Scanner s= new Scanner(System.in);
	   
	   for(i=0; i<3; i++)
	   {   
	      System.out.println("Enter user_id");
	      user_id=s.nextLine();
	      System.out.println("Enter password");
	      password=s.nextLine();
	   
	   if(user_id.equals("Muskaan") && password.equals("user"))
	   {
		   System.out.println("Welcome " +user_id);
	   break;
	   }
	  
	   else 
	   {
		   System.out.println("Wrong credentials, try again");
		   
	   }
	   }
	    
	   if (i == 3)
		   System.out.println("Contact Admin");
       s.close();
    }


}
