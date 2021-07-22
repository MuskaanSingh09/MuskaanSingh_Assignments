package assignment02;
abstract class Bank
{
	double fixeddeposits=500000;
    double cashcredit=100000;
    abstract double TotCash();
}

class SavingsAccountHolder extends Bank
{
	//@override
	double TotCash()
	{
		return fixeddeposits;
	}
}
 class CurrentAccountHolder extends Bank
 {
	 double TotCash()
	 {
		 return cashcredit;
	 }
 }
 public class Solution_03
 {
	 public static void main(String[] args)
	 {
		 Bank bank = new SavingsAccountHolder();
		 
		 double r,n,t,a;
		 double temp;
		 r = 8;
		 t=6;
		 n=5;
		 temp=(1+r/n);
		 
		 a = bank.fixeddeposits*Math.pow(temp, (n*t));
		 double amount = Math.round(a);
		 System.out.println("Fixed Deposites: "+ amount);
		 
		 Bank bank1 = new CurrentAccountHolder();
		 double amount1= bank1.cashcredit;
		 
		 System.out.println("Total " +amount + amount1);
	 }
 }


