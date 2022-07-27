package Assn7;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q1LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Set<String> colors = new LinkedHashSet<>();
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");

		System.out.println(colors.contains("Blue"));
		System.out.println();
		
		colors.remove(2);
		
		Iterator<String> itr = colors.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
