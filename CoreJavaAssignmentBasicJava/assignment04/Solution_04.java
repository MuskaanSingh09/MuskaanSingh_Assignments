package assignment04;
import java.util.ArrayList;

public class Solution_04 
{
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	employeeList.removeIf(s->(s.length()%2 !=0));
    	return employeeList;
    }
    public static void main(String[] args) 
    {
    	
    }
}

