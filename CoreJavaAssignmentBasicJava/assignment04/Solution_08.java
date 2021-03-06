package assignment04;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



public class Solution_08 implements Runnable 
{
	static void printList(List<Integer> list)
	{
		for(Integer i : list)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution_08 ob = new Solution_08();
		Thread t = new Thread(ob);
		t.start();
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(112);
		list.add(8);
		list.add(6);
		Consumer<List<Integer>> consu = Solution_08::printList;
		consu.accept(list);
	}
}
