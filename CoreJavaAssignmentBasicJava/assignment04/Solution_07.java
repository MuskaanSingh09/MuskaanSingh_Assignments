package assignment04;
import java.util.HashMap;

public class Solution_07
{
    public static void main(String[] args) {
    	
    }
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    	StringBuilder res = new StringBuilder();
    	for(HashMap.Entry<String,Integer> mp:map.entrySet()) {
    		res.append(mp.getKey()+mp.getValue());
    	}
    	return res.toString();
    }
}
