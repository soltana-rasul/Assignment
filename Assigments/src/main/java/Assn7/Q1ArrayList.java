package Assn7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Q1ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<String> customers = new ArrayList<>();
		
		customers.add("Steven");
		customers.add("Shannon");
		customers.add("Daria");
		
		customers.remove(0);
		
		ListIterator<String> itr = customers.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
