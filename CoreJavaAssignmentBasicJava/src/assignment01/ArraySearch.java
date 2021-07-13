package assignment01;
import java.util.Scanner;
public class ArraySearch
{

	public static void main(String[] args)
	{
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int element,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter element you want to search");
		element = s.nextInt();
		for(i=0; i<arr.length; i++)
		{
	      if(arr[i]==element)
	      {
	    	  System.out.println("Element is present at "+i+" index position");
	      }
		}
		
       s.close();
	}

}
