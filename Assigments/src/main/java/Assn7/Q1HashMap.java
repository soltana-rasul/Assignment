package Assn7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Q1HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, Object> studentID = new HashMap<>();
		
		studentID.put("Justin", 4393);
		studentID.put("Sam", 5313);
		studentID.put("Alex", 4553);
		
		System.out.println("ID number is " + studentID.get("Sam"));
		System.out.println();
		
		studentID.remove(2);
		

		Iterator<Entry<String, Object>> itr = studentID.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
