package assignment01;

public class ArmstrongRange {
     
	public static void main(String[] args) {
		int i,arm=0,rem,a;
		System.out.println("Armstrong numbers between 100 and 999 are: ");
		for ( i=100; i<1000; i++ )
		{
			a=i;
			arm=0;
			while(a>0)
			{
				rem=a%10;
				arm=arm+(rem*rem*rem);
				a=a/10;
			}
			if(i==arm)
			{
				System.out.println(i+" ");
			}
		}
			

	}

}
