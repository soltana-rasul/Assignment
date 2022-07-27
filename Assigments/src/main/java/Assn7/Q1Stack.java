package Assn7;

import java.util.Iterator;
import java.util.Stack;

public class Q1Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Object> students = new Stack<>();
		
		students.add("Caroline");
		students.add("Justin");
		students.add("Brandon");
		students.add("Susan");
		
		System.out.println("The number of students is " + students.size());
		System.out.println("The last student is " + students.lastElement());
		System.out.println();
		
		System.out.println("The students that completed the homework are: ");
		students.remove(1);
		
		Iterator<Object> itr = students.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
