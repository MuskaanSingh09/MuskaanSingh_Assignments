package assignment03;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Solution_05 
{
    List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");

    public static void main(String[] args) { }

    public static String processWords(List<String> list) {
    	StringBuilder sb = new StringBuilder();
    	Consumer<List<String> > select = lis -> 
        { 
            for (int i = 0; i < lis.size(); i++) {
            	String wor = lis.get(i);
            	sb.append(wor.charAt(0));
            }
                
        }; 
        select.accept(list);
        return sb.toString();
    }
}

