package assignment02;

public class Solution_01
{

	private static Solution_01 Singleton;
	
	private Solution_01()
	{
		
	}
	public static Solution_01 getInstance()
	{
		if(null == Singleton)
		{
			Singleton = new Solution_01();
		}
	
	return Singleton;	
	}
	public static void main(String[] args)
	{
		Solution_01 Singleton = Solution_01.getInstance();
		Solution_01 Singleton1 = Solution_01.getInstance();
	}

	

}
