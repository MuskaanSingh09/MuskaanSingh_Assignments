package assignment02;

abstract class Employee
{
	double salary1=10000;
	double salary2=5000;
	double incentive=500;
	double OT=200;
	double totalsalary1;
	double totalsalary2;
	abstract double TotalSalary();
}
 class Manager extends Employee
 {   
	 
	 double TotalSalary()
	 {   
		 double Totalsalary1 = incentive + salary1;
		   System.out.println("Total Salary of Manager is "+Totalsalary1);
		return totalsalary1;
	 }
 }
 class Labour extends Employee
 {
	 double TotalSalary()
	 {
		
		   double Totalsalary2 = OT + salary2;
		   System.out.println("Total Salary of Labour is "+Totalsalary2);
	      return totalsalary2;
	 }
 }
 
public class Solution_02
{
  public static void main(String args[])
  {
	
   Manager man = new Manager();
   man.TotalSalary();
   Labour lb = new Labour();
   lb.TotalSalary();
   
  }
   
}