package assignment04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface satisfied{
	public ArrayList<Solution_02> getList(ArrayList<Solution_02> ord);
}

public class Solution_02 {

    private int totalPrice;
    private String status;
    

    public Solution_02(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Solution_02 [totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	public static ArrayList<Solution_02> listOfOrders(ArrayList<Solution_02> orders) {
    	satisfied st = (list)->{
    		ArrayList<Solution_02> list2 = new ArrayList<>();
    		for(Solution_02 ob: list) {
    			if((ob.getTotalPrice() > 10000) && (ob.getStatus().equals("ACCEPTED") || ob.getStatus().equals("COMPLETED") )) {
    				list2.add(ob);
    			}
    		}
    		return list2;
    		};
    	
    	ArrayList<Solution_02> lis = st.getList(orders);
    	
    	return lis;
    }
	
    public static void main(String[] args) {
    	Solution_02 od1 = new Solution_02(10020,"ACCEPTED");
    	Solution_02 od2 = new Solution_02(8000,"COMPLETED");
    	Solution_02 od3 = new Solution_02(12000,"ACCEPTED");
    	Solution_02 od4 = new Solution_02(120,"ACCEPTED");
    	Solution_02 od5 = new Solution_02(60000,"COMPLETED");
    	Solution_02 od6 = new Solution_02(1230,"ACCEPTED");
    	Solution_02 od7 = new Solution_02(10002,"ACCEPTED");
    	Solution_02 od8 = new Solution_02(11000,"PROCESSING");
    	
    	ArrayList<Solution_02> ords = new ArrayList<Solution_02>();
    	ords.add(od1);
    	ords.add(od2);
    	ords.add(od3);
    	ords.add(od4);
    	ords.add(od5);
    	ords.add(od6);
    	ords.add(od7);
    	ords.add(od8);
    	
    	ArrayList<Solution_02> ords2 = listOfOrders(ords);
    	for(Solution_02 ob : ords2) {
    		System.out.println(ob);
    	}
    }
}

