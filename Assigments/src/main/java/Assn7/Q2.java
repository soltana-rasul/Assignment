package Assn7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1 = new Students("Justin", "Boy", 22, 87);
		Students s2 = new Students("Christina", "Girl", 25, 93);
		Students s3 = new Students("Marvin", "Boy",29, 78);

		List<Students> stu = new ArrayList<>();
		
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		
		Collections.sort(stu, new Comparator());
		for(Students s : stu) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getGender + " " + s.getGrade());
		}

	}

}

class Students implements Comparable<Students> {
	

	public Students(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	private String name;
	private String gender;
	private int id;
	private int grade;
	
	@Override	
	public int compareTo(Students s) {
		return this.name.compareTo(s.getName());
	}
}