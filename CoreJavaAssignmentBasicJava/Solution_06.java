package assignment02;

import java.util.Scanner;

abstract class Persistence
{
	abstract void persist();
}
class FilePersistence extends Persistence
{
	void persist()	
	{
	  
	}
}
class DatabasePersistence extends Persistence
{
	void persist()
	{
		
	}
}

public class Solution_06
{
  public static void main(String[] args)
  {
	 Scanner s = new Scanner(System.in);
	 
	 Persistence per;
	 System.out.println("Press 1 for saving data in file or press 2 for saving data in database");
	 int choose = s.nextInt();
	 
	 if(choose == 1)
	 {
		 per = new FilePersistence();
		 per.persist();
	 }
	 
	 else if(choose == 2)
	 {
		 per = new DatabasePersistence();
		 per.persist();
	 }
	 else 
	 {
		 System.out.println("Invalid input");
	 }
	  		  s.close();
  }
}
