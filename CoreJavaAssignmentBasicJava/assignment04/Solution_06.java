package assignment04;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.ArrayList;

public class Solution_06 
{
    public static void main(String[] args)
    {
    	
    	List<String> list= new ArrayList<String>();
		UnaryOperator<String> unaryOperator=a->a.toUpperCase();
    	
    	list.add("Hen");
		list.add("Egg");
		list.add("london");
		list.add("Leaves");
		list.add("Orchid");
		list.add(" xford");
		list.add("Gxford");
		list.add("Uxford");
		list.add("Yxford");
		list.add("Sxford");
    	
    
    	
    	list.replaceAll(s->s.toUpperCase());
    	
    	list.forEach(System.out::println);
    }  
    
}
