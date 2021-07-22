package assignment04;
import java.util.ArrayList;
import java.util.List;

public class Solution_05 {
	
	public static void main(String[] args) {
		
		StringBuilder result=new StringBuilder();
		List<String> list= new ArrayList<String>();
		
		list.add("Hen");
		list.add("Egg");
		list.add("London");
		list.add("Leaves");
		list.add("Orchid");
		list.add(" xford");
		list.add("Gxford");
		list.add("Uxford");
		list.add("Yxford");
		list.add("Sxford");
		
		list.forEach(a->result.append(a.charAt(0)));
		
		System.out.println(result);
		
	}	
}

