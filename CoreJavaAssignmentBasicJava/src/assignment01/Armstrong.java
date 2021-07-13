package assignment01;

//import java.util.Scanner;

import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int n,arm=0,a,rem;
		System.out.print("Enter a number");
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		a=n; 
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(a==arm)
			System.out.print("The supplied value is armstrong");
		else
			System.out.print("The supplied value is not armstrong");
        s.close();
	}

}
