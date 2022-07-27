package Assn7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Q1TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1 = new Students("Justin", 22, 87);
		Students s2 = new Students("Christina", 25, 93);
		Students s3 = new Students("Marvin", 29, 78);

		Map<String, Students> stu = new TreeMap<>();
		
		stu.put("Justin", s1);
		stu.put("Christina", s2);
		stu.put("Marvin", s3);
		
		stu.remove("Christina");

		Iterator<Entry<String, Students>> itr = stu.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

class Students{
	
	Students(String name, int id, int grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	private String name;
	private int id;
	private int grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
}
