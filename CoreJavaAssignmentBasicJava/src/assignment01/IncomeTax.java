package assignment01;
import java.util.*;
public class IncomeTax
{

	public static void main(String[] args)
	{
		float income;
		Scanner s=new Scanner(System.in);
				System.out.println("Enter your CTC");
		income=s.nextFloat();
		if(income>0 && income<=180000)
			System.out.println("Tax payable is NIL");
		else if(income>=181000 && income<=300000)
			System.out.println("10% is tax payable");
		else if(income>=300001 && income<=500000)
			System.out.println("20% is Tax payable");
		else
			System.out.println("30% is Tax payable");
		
		s.close();
		

	}

}
