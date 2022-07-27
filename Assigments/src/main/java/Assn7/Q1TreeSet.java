package Assn7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Q1TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> colors = new TreeSet<>();
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");

		colors.remove("Green");
		
		Iterator<String> itr = colors.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
