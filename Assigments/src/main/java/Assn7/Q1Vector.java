package Assn7;

import java.util.Iterator;
import java.util.Vector;

public class Q1Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<Object> employeeID = new Vector<>();
		String num = "three two five nine";
		
		employeeID.add(3940);
		employeeID.add(3043);
		employeeID.add(4434);
		employeeID.add(num);
		
		employeeID.remove(2);
		
		Iterator<Object> itr = employeeID.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
