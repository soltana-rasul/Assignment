package Assn7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q1HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> colors = new HashSet<>();
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");

		colors.remove(1);
		
		Iterator<String> itr = colors.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
