package assignment02;
public class Solution_04
{
 public static void main(String args[])
 {
	son s = new son();
	daughter d = new daughter();
	s.disp();
	d.disp();
 }
 
}
abstract class father   //abstract class
{
	abstract void disp();  //abstract method
}
class son extends father  //sub class son
{
	void disp()
	{
		System.out.println("Abstract method defined in Sub Class son");
	}
}
class daughter extends father
{
	void disp()
	{
		System.out.println("Abstract method defined in sub class daughter");
	}
}

