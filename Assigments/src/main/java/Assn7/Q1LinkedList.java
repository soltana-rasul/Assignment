package Assn7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q1LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> customers = new LinkedList<>();
		List<String> customers2 = new ArrayList<>();
		
		customers.add("Steven");
		customers.add("Shannon");
		customers.add("Daria");
		
		customers.remove(1);
		
		Iterator<String> itr = customers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
