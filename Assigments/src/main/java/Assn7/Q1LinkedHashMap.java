package Assn7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q1LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Map<String, String> colors = new LinkedHashMap<>();
		
		colors.put("Blue", "Red");
		colors.put("Green", "Orange");
		colors.put("Yellow", "White");
				
		colors.remove("Yellow");
		

		Iterator<Entry<String, String>> itr = colors.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
